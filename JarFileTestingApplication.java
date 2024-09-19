package com.jar;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 
@SpringBootApplication
public class JarFileTestingApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JarFileTestingApplication.class, args);
 		 new ClassA().method();

	}

}
