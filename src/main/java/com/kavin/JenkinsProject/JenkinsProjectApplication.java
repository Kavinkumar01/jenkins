package com.kavin.JenkinsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
		JenkinsProjectApplication.print();
	}
	
	public static void print() {
		System.out.println("The pipeline has started");
	}

}
