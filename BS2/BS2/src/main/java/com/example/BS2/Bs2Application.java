package com.example.BS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Bs2Application {
	@Autowired
	PersonaService personaService;
	@Autowired
	CiudadService ciudadService;

	public static void main(String[] args) {
		SpringApplication.run(Bs2Application.class, args);
	}


}
