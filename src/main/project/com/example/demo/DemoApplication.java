package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	/*@RequestMapping("/")
	public String home(){
		return "Hello from Docker";

	}*/

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}

//./mvnw package && java -jar target/demo-0.0.1-SNAPSHOT.jar

//docker build -t springio/gs-spring-boot-docker .
//docker build -t springio/demo .
//docker run -p 8080:8080 -t springio/demo
// mkdir -p target/dependency && (cd target/dependency; jar xf ../*.jar)