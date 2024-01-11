package com.castonworks.libraryrestapi.repository;

import com.castonworks.libraryrestapi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book, Long>{

}
