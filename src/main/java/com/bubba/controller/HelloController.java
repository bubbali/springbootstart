package com.bubba.controller;

import org.springframework.web.bind.annotation.RestController;

import com.bubba.bean.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Hello world!
 *
 */
@RestController
public class HelloController {
	@Autowired
	private Person person;
	@RequestMapping("/greetings")
	public String index() {
		return "Greetings from Spring boot";
	}
	
	@RequestMapping("/getPerson")
	public Person getPerson() {
		return person;
	}
}
