package com.bubba.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@PropertySource({"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person") //from Application.properties
//1. Load the Global configuration 2. Load the specific properties file 
public class Person {
	public String firstName;
	public String lastName;
	public Integer age;
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", boss=" + boss + "]";
	}
	public boolean boss;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isBoss() {
		return boss;
	}
	public void setBoss(boolean boss) {
		this.boss = boss;
	}
	

}
