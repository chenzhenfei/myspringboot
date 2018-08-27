package com.example.studyspringboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.studyspringboot.dao.*.mapper")
public class StudyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyspringbootApplication.class, args);
    }
}
