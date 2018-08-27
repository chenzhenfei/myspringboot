package com.example.studyspringboot;

import com.example.studyspringboot.dto.User;
import com.example.studyspringboot.services.user.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =  StudyspringbootApplication.class)
//@PropertySource("classpath:/application.yml")
public class StudyspringbootApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void testSave() {
        User u =new User();
        u.setName("wangwu");
        u.setAge(26);
        u.setPassword("11100247");
        u.setSex("0");
        u.setStatus("0");
        userService.save(u);
    }


    @Before
    public void beforeTest(){
        System.out.println("前置测试");
    }


    @After
    public void afterTest(){
        System.out.println("后置测试");
    }

}
