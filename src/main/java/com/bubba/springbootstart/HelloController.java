package com.bubba.springbootstart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Hello world!
 *
 */
@RestController
public class HelloController {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring boot";
	}
}
