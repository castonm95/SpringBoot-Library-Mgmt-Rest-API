package com.castonworks.libraryrestapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "publisher")
@Data
public class Publisher {

    @Id
    private long id;

    @Id
    private String name;

    private String address;

    @OneToMany
    private List< Book> book;

}
