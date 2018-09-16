package com.example.studyspringboot.services.book;

import com.example.studyspringboot.dto.book.Book;
import com.example.studyspringboot.dto.user.User;

import java.util.List;

public interface BookService {
    int save(Book book);

    List<User> findAll();

    String test();
}
