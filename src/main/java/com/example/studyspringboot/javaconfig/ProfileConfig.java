package com.example.studyspringboot.javaconfig;


import com.example.studyspringboot.services.book.BookServiceImpl;
import com.example.studyspringboot.services.common.ProfileService;
import com.example.studyspringboot.services.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @profile 配置  ：为不同环境下使用不同配置提供了支持（开发和测试环境下的配置肯定是不同的，例如：数据库配置）
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public ProfileService userCommonService(){
        ProfileService a =new ProfileService();
        a.setProfile("dev");
        return a   ;
    }

    @Bean
    @Profile("prod")
    public ProfileService bookCommonService(){
        ProfileService a =new ProfileService();
        a.setProfile("prod");
        return a   ;
    }

}
