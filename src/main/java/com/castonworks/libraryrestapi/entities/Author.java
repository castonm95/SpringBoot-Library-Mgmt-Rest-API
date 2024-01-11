package com.castonworks.libraryrestapi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Author {

     @Id
     private long id;

     private String fullName;

     private String dateOfBirth;

     @OneToOne
     private Book book;


}

