package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/europe")
public class TspTurkeyController {
	@GetMapping("/tspTurkey")
	public String tspTurkey() {
		return "This is TSP Turkey";
	}
	
	@GetMapping("/tspGermany")
	public String tspGermany() {
		return "This is TSP Germany";
	}
}
