package com.example.studyspringboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.studyspringboot.dao.repository")
public class StudyspringbootApplication {

    public static void main(String[] args) {

        SpringApplication start =new SpringApplication(StudyspringbootApplication.class);
//        start.setBannerMode(Banner.Mode.OFF);
//        start.setAdditionalProfiles("prod");
        start.run();
    }


}
