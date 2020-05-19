package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/asiapacific")
public class MyServiceIndiaController {
	@GetMapping("/myserviceIndia")
	public ResponseEntity<?> tspIndia() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("custom-header", "MyServiceINDIA");
		
		MyServiceVO tspvo1 = new MyServiceVO();
		tspvo1.setMessage("This is My Service India");
		tspvo1.setLocation("India");
		tspvo1.setName("My Service");
		
		return new ResponseEntity<MyServiceVO>(tspvo1,httpHeaders,HttpStatus.OK);
	}
	
	@GetMapping("/myserviceChina")
	public ResponseEntity<?> tspChina() {
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("custom-header", "MyServiceCHINA");
		MyServiceVO tspvo1 = new MyServiceVO();
		tspvo1.setMessage("This is MyService CHina");
		tspvo1.setLocation("China");
		tspvo1.setName("My Service");
		
		return new ResponseEntity<MyServiceVO>(tspvo1,httpHeaders,HttpStatus.OK);
	}
	
	
}
