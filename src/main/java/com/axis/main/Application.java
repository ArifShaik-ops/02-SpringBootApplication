package com.axis.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
       
	   private Map<String,Object> cache=new HashMap<String,Object>();
	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
	int a=10;
	// Changes for HIS-134
	context.close();
		
		
		
	}
        public void loadDataToCache()
        {
         // logic
        }


}
