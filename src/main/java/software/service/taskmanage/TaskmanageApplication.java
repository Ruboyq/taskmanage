package software.service.taskmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("software.service.taskmanage.dao")
public class TaskmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskmanageApplication.class, args);
    }

}
