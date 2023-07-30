package com.siddhantbhardwaj.LibraryApplication.service;

import com.siddhantbhardwaj.LibraryApplication.dto.Book;
import org.springframework.stereotype.Service;

public interface BookService {

    public Book addBook(Book book);

    public Book updateBook(Book book);

    public Book getBook(long id);

    public String deleteBook(long id);

}
