package com.dio.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.endpoint.model.Person;
import com.dio.endpoint.service.PersonService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
public class PersonController {
	@Autowired
	PersonService personService;
	
	@GetMapping("/person")
	private List<Person> getAllStudent(){
		return personService.getAllStudent();
	}
	
	@GetMapping("/person/{id}")
	private Person getStudent(@PathVariable("id") int id) {

	return personService.getStudentById(id);
	}	
	@DeleteMapping("/person/{id}") 
	private void deleteStudent(@PathVariable("id") int id) {
		personService.delete(id);
	}
	
	@PostMapping("/person")
	private int saveStudent(@RequestBody Person student)
	{
		personService.saveOrUpdate(student);
		return student.getId(); 	
	}
	
	
}
