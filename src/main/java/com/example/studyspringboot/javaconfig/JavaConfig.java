package com.example.studyspringboot.javaconfig;


import com.example.studyspringboot.services.book.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * java 配置实现spring bean 管理,这种方式可以在 spring 的bean 的管理方面可以通过
 * init 和destory 来指定bean 初始化之后或者销毁之前可以做的事情
 */
@Configuration
public class JavaConfig {


    /**
     *  可以制定bean 的initmethod 和 destorymethod
     * @return
     */
    @Bean(initMethod = "initTest" ,destroyMethod = "destoryTest")
    public BookServiceImpl bookServiceImpl () {
        return new BookServiceImpl ();
    }

}
