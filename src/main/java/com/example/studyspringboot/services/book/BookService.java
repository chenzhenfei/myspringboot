package com.example.studyspringboot.services.book;

import com.example.studyspringboot.dto.book.Book;
import com.example.studyspringboot.dto.user.User;
import com.example.studyspringboot.services.common.CommonService;

import java.util.List;

public interface BookService extends CommonService {
    int save(Book book);

    List<User> findAll();

    String test();
}
