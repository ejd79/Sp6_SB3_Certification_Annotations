package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    //    @RequestMapping("/book")
//    @ResponseBody
    @GetMapping("/book")
    public Book getBook() {
        Book book = new Book(1, "Life", "Just a book for living");
        return book;
    }

    //    @RequestMapping(value = "/book/create", method = RequestMethod.POST)
    @PostMapping(value = "/book/create",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

}
