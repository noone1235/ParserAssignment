package com.chary.main;


import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chary.main.service.Service;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) throws IOException, TikaException, Exception {
		SpringApplication.run(Project1Application.class, args);
		
		
		Service service=new Service();
		
		service.main();
	}

}
