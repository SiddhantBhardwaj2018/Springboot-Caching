package com.siddhantbhardwaj.LibraryApplication.controller;

import com.siddhantbhardwaj.LibraryApplication.dto.Book;
import com.siddhantbhardwaj.LibraryApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") long id){
        return bookService.getBook(id);
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable("id") long id){
        return bookService.deleteBook(id);
    }

}
