package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.bubba.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
	@Autowired
	private Person person;
	
	@Autowired
	ApplicationContext ioc;
	//Logger
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void testService() {
		Boolean flag = ioc.containsBean("helloService");
		System.out.println(flag);
	}
	
	@Test
	public void contextLoads() {
		logger.trace("Trace level");
		logger.debug("Debug level");
		//Spring default level >=info
		logger.info("Info level");
		logger.warn("Warn level");
		logger.error("Error level");
		System.out.println(person);
	}
}
