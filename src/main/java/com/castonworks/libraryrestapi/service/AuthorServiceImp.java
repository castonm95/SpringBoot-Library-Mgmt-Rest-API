package com.castonworks.libraryrestapi.service;

import com.castonworks.libraryrestapi.entities.Author;
import com.castonworks.libraryrestapi.entities.Book;
import com.castonworks.libraryrestapi.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImp implements AuthorService {

    private AuthorRepository authorepository;

    @Override
    public List<Author> getAllAuthorById(Long id) {
        return authorepository.findAll();
    }

    @Override
    public Author addAuthor(Author author) {
        return authorepository.save(author);
    }

    @Override
    public void deleteAuthorById(Long id) {
        //TODO perform extra logic to check if the book exists first
        //1. retrieve by id , if not found throw an exception or give response to user that book is not found
        //2 . If book is found then delete book
        authorepository.deleteById(id);

    }

    @Override
    public Author updateAuthor(Long id, Author updatedAuthor) {
        return null;
        //1. first retrieve the book by Id , if not found throw an exception saying book not found
        //2 . if book is found then update the book

    }
}

