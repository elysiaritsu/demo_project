package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;


@SpringBootTest
class BirdFlyTest {
	
	@Autowired
	private Active active;
	
	@Test
	void contextLoads() {
		active.fly("Elysia", 5);
//		System.out.println(birds.getAge());
	}
	
}
