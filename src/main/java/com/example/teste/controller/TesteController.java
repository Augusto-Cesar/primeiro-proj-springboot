package com.example.teste.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {
	
	@RequestMapping("/msg")
	public String teste() {
		return "Massa Véi!";
	}
	
}
