package com.springframework.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.spring.domain.Author;

public interface AuthorRespository extends CrudRepository<Author, Long> {

}
