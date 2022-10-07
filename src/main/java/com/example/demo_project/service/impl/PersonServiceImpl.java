package com.example.demo_project.service.impl;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

public class PersonServiceImpl implements PersonService {
	

	@Override
	public Person getPersonInfo(String id) {
		Person person = new Person();
		person.setAge(18);
		person.setCity("Belize City");
		person.setId(id);
		person.setName("Elysia");
		
		return person;
	}

}
