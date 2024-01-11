package com.castonworks.libraryrestapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {

    @Id
    private long id;

    private String title;

    private String author;

    @OneToMany
    private List<Author> authors;

}
