package com.example.jpa.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(JpademoApplication.class, args);
		System.out.println("Hello!!");
		
		/*Employee emp=context.getBean(Employee.class);
		emp.show();*/
		
	}

}
