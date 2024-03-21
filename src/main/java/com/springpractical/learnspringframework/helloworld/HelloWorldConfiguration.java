package com.springpractical.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Tushar";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	
	@Bean
	@Primary
	public Person person() {
		return new Person("Rohan", 20, new Address("Mansarovar", "Jaipur"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	/*
	Error creating bean with name 'person3Parameters' defined in com.springpractical.learnspringframework.HelloWorldConfiguration: 
	Unsatisfied dependency expressed through method 'person3Parameters' parameter 2: 
	No qualifying bean of type 'com.springpractical.learnspringframework.Address' available: 
	expected single matching bean but found 2: personAddress,address3
	@Bean
	public Person person3Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	*/
	
	@Bean
	public Person person4Parameters(String name, int age, @Qualifier("address3Qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	
	@Primary
	@Bean(name = "personAddress")
	public Address address() {
		return new Address("Malviya Nagar", "Jaipur");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		return new Address("Jhotwara", "Jaipur");
	}
	
	
}
