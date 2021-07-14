package com.springframework.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.spring.domain.Book;

public interface BookRepository extends CrudRepository<Book , Long> {

}
