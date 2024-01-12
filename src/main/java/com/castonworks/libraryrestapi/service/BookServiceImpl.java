package com.castonworks.libraryrestapi.service;

import com.castonworks.libraryrestapi.entities.Book;
import com.castonworks.libraryrestapi.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;


    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        //TODO perform extra logic to check if the book exists first
        //1. retrieve by id , if not found throw an exception or give response to user that book is not found
        //2 . If book is found then delete book
        bookRepository.deleteById(id);
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        //1. first retrieve the book by Id , if not found throw an exception saying book not found
        //2 . if book is found then update the book
        return null;
    }
}
