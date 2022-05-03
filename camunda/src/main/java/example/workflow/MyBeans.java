package example.workflow;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = {"com.example.demo"})
public class MyBeans {

    @Bean
    public JavaDelegate ahoyService() {
        return execution -> System.out.println("\n\nAhoy " + execution.getVariable("myVariable") + "!");
    }

    @Bean
    public JavaDelegate createStudent(StudentRepository repository) {
        return execution -> {
            int randNum = (new Random()).nextInt(100);
            String name = execution.getVariable("studentName") + Integer.valueOf(randNum).toString();

            Student newStudent = new Student(
                    name,
                    LocalDate.of(2022 - randNum, Month.JANUARY, 10),
                    name + "@yahoo.com"
            );
            repository.save(newStudent);
        };
    }
}
