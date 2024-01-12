package com.castonworks.libraryrestapi.service;


import com.castonworks.libraryrestapi.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

     List<Book> getAllBooks();

     Optional<Book> getBookById(Long id);

     List<Book> getBooksByAuthor(String author);

     Book addBook(Book book);

     void deleteBook(Long id);

     Book updateBook(Long id, Book updatedBook);

}
