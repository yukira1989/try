package com.spring.service;

import org.springframework.stereotype.Component;

import com.spring.entity.Person;

@Component
public class DefaultPersonService implements PersonService {

	@Override
	public Person getPerson() {
		Person p = new Person();
		p.setId(1);
		p.setName("Name");
		return p;
	}


}
