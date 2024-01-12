package com.castonworks.libraryrestapi.service;


import com.castonworks.libraryrestapi.entities.Author;
import com.castonworks.libraryrestapi.entities.Book;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> getAllAuthorById(Long id);

    Author addAuthor(Author author);

    void deleteAuthorById(Long id);

    Author updateAuthor(Long id,   Author updatedAuthor);

}