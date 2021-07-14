package com.springframework.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.spring.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher , Long> {

}
