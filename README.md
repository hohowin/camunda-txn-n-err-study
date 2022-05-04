# camunda-txn-n-err-study

References:
- Medium - [Combine Multiple Springboot Applications into a Single Application](https://medium.com/@eranda/combine-multiple-springboot-applications-into-a-single-application-649514e7a447)
- Youtube - [Create an IntelliJ project with Sub Modules & Fix project structure | IntelliJ Tutorial](https://youtu.be/4WJ3b2GTDko)
- Kong - [Maven – How to create a multi module project](https://mkyong.com/maven/maven-how-to-create-a-multi-module-project/)
- Oracle - [Building a Real Application with Maven](https://docs.oracle.com/middleware/1212/core/MAVEN/real_app.htm#MAVEN8917)

## To Run the Applications

1\. Start Postgres

```bash
docker-compose up -d
```

2\. Start the Student Applications by running `com.example.demo.DemoApplication`

3\. Can verify by browsing `http://localhost:8080/api/v1/student`

4\. Start Camunda by running `example.workflow.Application`

5\. Login to Camunda. `http://localhost:8088`

## To Shut Down 

Stop the `Applications` and `docker compose`.
