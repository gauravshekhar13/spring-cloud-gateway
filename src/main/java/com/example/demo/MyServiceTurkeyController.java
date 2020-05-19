package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/europe")
public class MyServiceTurkeyController {
	
	@GetMapping("/myserviceTurkey")
public ResponseEntity<?> tspTurkey() {
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("custom-header", "MYServiceTURKEY");
		MyServiceVO tspvo1 = new MyServiceVO();
		tspvo1.setMessage("This is MyService TURKEY");
		tspvo1.setLocation("TURKEY");
		tspvo1.setName("MyService");
		
		return new ResponseEntity<MyServiceVO>(tspvo1,httpHeaders,HttpStatus.OK);
	}
	
	@GetMapping("/myserviceGermany")	
public ResponseEntity<?> tspGermany() {
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("custom-header", "MyServiceGERMANY");
		MyServiceVO tspvo1 = new MyServiceVO();
		tspvo1.setMessage("This is MyService Germany");
		tspvo1.setLocation("Germany");
		tspvo1.setName("MyService");
		
		return new ResponseEntity<MyServiceVO>(tspvo1,httpHeaders,HttpStatus.OK);
	}
}
