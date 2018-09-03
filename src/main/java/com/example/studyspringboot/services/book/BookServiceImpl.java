package com.example.studyspringboot.services.book;


import com.example.studyspringboot.dao.repository.book.BookMapper;
import com.example.studyspringboot.dto.book.Book;
import com.example.studyspringboot.dto.user.User;
import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;


//@Service
public class BookServiceImpl implements  BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int save(Book book) {
        return 0;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public String test() {
        return "book1";
    }

    @PostConstruct
    public void initTest(){
        System.out.println("spring bean 初始话之后执行");
    }

    @PreDestroy
    public void destoryTest(){
        System.out.println("spring bean 销毁之前执行");
    }

    @Override
    public String testProfile() {
        return "bookServiceImple";
    }
}
