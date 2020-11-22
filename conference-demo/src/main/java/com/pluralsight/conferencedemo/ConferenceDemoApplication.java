package com.pluralsight.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// When you deploy a war to an external container it expects a context to be available.
// It also expects a web.xml file with defines how the app will get deployed. Since the Spring Boot does not
// have a web.xml file in it, this class provides that value and information to the external container. Whiout
// this, you won't be able to access your app properly via a context when you go to access it
@SpringBootApplication
public class ConferenceDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceDemoApplication.class, args);
	}

}
