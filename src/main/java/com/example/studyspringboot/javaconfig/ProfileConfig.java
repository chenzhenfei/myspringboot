package com.example.studyspringboot.javaconfig;


import com.example.studyspringboot.services.book.BookServiceImpl;
import com.example.studyspringboot.services.common.CommonService;
import com.example.studyspringboot.services.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public CommonService userCommonService(){
        return  new UserServiceImpl();
    }

    @Bean
    @Profile("prod")
    public CommonService bookCommonService(){
        return  new BookServiceImpl();
    }

}
