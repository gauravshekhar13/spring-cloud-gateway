package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/asiapacific")
public class TspIndiaController {
	@GetMapping("/tspIndia")
	public String tspIndia() {
		return "This is TSP India";
	}
	
	@GetMapping("/tspChina")
	public String tspChina() {
		return "This is TSP China";
	}
	
	@GetMapping("/tspJapan")
	public String tspJapan() {
		return "This is TSP Japan";
	}
}
