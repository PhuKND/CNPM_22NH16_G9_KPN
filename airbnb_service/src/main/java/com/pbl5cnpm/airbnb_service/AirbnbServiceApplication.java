package com.pbl5cnpm.airbnb_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirbnbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbServiceApplication.class, args);
		String str = """ 
		-----------------------------------------------
		|		Server running at                     
		|	localhost:8080/api/guest/hello            
		|	localhost:8080/api/admin                  
		|	localhost:8080/api/host                   
		-----------------------------------------------
					""";
		System.out.println(str);
	}

}
