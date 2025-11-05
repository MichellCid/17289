package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Hello web");
	}

	@RequestMapping("/")
	public String home() {
		System.out.println("bienvenido");
		return("Bienvenido");
	}

	@RequestMapping("/hola")
	public String hola() {
		System.out.println("Hello");
		return("Bienvenido tu");
	}

	@RequestMapping("/adios")
	public String adios() {
		System.out.println("bye");
		return("Bienvenido yo");
	}

	@RequestMapping("/html")
	public String html() {
		String html="<html><body><h1>hola</h1><p>lorem ipsum</p></body></html>";
		return html;
	}

}
