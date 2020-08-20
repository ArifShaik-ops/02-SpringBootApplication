package com.axis.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    private static final String REST_URL="https://www.equifax.com/getScores";
	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
	int a=10;
	// Changes for HIS-134
	context.close();
		
		
		
	}

}
