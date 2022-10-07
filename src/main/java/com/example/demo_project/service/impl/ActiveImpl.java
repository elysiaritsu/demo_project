package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;

@Service
public class ActiveImpl implements Active {
	
	@Override
	public Bird fly(String name, int age) {
		Bird bird = new Bird();
		bird.setAge(age);
		bird.setName(name);
		
		System.out.println("今年 "+ bird.getAge() + " years old"+ ','+ bird.getName() + " 正在飛");
		return bird;
	}

}
