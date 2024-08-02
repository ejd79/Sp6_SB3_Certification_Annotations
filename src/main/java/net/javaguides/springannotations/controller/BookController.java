package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")
//    @ResponseBody
    public String helloWorld() {
        return "hello world";
    }

    @RequestMapping("/book")
//    @ResponseBody
    public Book getBook() {
        Book book = new Book(1,"Life", "Just a book for living");
        return book;
    }

}
