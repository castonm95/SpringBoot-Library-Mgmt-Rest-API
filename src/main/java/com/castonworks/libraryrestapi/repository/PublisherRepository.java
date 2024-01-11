package com.castonworks.libraryrestapi.repository;

import com.castonworks.libraryrestapi.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository <Publisher, Long>{

}
