package com.example.studyspringboot.controller.book;

import com.example.studyspringboot.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/index")
    public String index(){
       return bookService.test();

    }

}
