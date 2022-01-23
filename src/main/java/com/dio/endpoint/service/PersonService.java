package com.dio.endpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.endpoint.model.Person;
import com.dio.endpoint.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	public List<Person> getAllStudent(){
		List<Person> people = new ArrayList<Person>();
		personRepository.findAll().forEach(person -> people.add(person));
		return people;
	}
	
	public Person getStudentById(int id) {
		return personRepository.findById(id).get();
	}
	
	public void saveOrUpdate(Person student) {
		personRepository.save(student);
	}

	public void delete(int id) {
		personRepository.deleteById(id);
	}
	
	
}
