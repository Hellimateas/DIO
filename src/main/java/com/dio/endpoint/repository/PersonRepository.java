package com.dio.endpoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.dio.endpoint.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
