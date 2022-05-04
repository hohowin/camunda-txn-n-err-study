package example.workflow;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class FailingDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("I am throwing MySpecialError....");
//        throw new BpmnError("MySpecialError", "I like to produce error.");
        throw new RuntimeException("I am throwing MySpecialError");
    }
}
