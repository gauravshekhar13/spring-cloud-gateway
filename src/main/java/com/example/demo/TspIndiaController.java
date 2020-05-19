package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/asiapacific")
public class TspIndiaController {
	@GetMapping("/tspIndia")
	public ResponseEntity<?> tspIndia() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("custom-header", "TSPINDIA");
		
		TSPVO tspvo1 = new TSPVO();
		tspvo1.setMessage("This is TSP India");
		tspvo1.setLocation("India");
		tspvo1.setName("TSP");
		
		return new ResponseEntity<TSPVO>(tspvo1,httpHeaders,HttpStatus.OK);
	}
	
	@GetMapping("/tspChina")
	public ResponseEntity<?> tspChina() {
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("custom-header", "TSPCHINA");
		TSPVO tspvo1 = new TSPVO();
		tspvo1.setMessage("This is TSP CHina");
		tspvo1.setLocation("China");
		tspvo1.setName("TSP");
		
		return new ResponseEntity<TSPVO>(tspvo1,httpHeaders,HttpStatus.OK);
	}
	
	@GetMapping("/tspJapan")
	public String tspJapan() {
		return "This is TSP Japan";
	}
}
