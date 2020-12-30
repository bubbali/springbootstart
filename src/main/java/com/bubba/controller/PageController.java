package com.bubba.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

import org.springframework.stereotype.Controller;

@Controller
public class PageController {
	@ResponseBody
	@RequestMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@RequestMapping("/success")
	public String success(Map<String,Object> map) {
		map.put("hello", "Bubba");
		return "success";
	}
}
