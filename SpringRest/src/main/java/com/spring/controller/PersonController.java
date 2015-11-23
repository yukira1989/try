package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.Person;
import com.spring.service.PersonService;

@RestController
@RequestMapping("/data")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/person/{id}")
	public ModelAndView getPerson(@PathVariable long id) {
		Person person = personService.getPerson();
		return new ModelAndView("index");
	}
	

}
