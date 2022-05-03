package com.example.project;

import com.example.project.chapter03.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjectApplication.class, args).getBean(ProjectApplication.class).execute();
    }

    @Autowired
    Greet greet;

    private void execute() {

            greet.greeting();
    }

}
