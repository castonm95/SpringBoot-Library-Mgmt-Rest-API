package com.castonworks.libraryrestapi.controller;

import com.castonworks.libraryrestapi.entities.Book;
import com.castonworks.libraryrestapi.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/v1/api")
@AllArgsConstructor
public class BookController {

    private BookService bookService;


    @PostMapping("/book")
    public Book createBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/retrieveBooks")
    public List<Book> retrieveAllBooks(){
        return bookService.getAllBooks();
    }

}
