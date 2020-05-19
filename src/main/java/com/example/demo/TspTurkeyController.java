package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/europe")
public class TspTurkeyController {
	
	@GetMapping("/tspTurkey")
public ResponseEntity<?> tspTurkey() {
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("custom-header", "TSPTURKEY");
		TSPVO tspvo1 = new TSPVO();
		tspvo1.setMessage("This is TSP TURKEY");
		tspvo1.setLocation("TURKEY");
		tspvo1.setName("TSP");
		
		return new ResponseEntity<TSPVO>(tspvo1,httpHeaders,HttpStatus.OK);
	}
	
	@GetMapping("/tspGermany")	
public ResponseEntity<?> tspGermany() {
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("custom-header", "TSPGERMANY");
		TSPVO tspvo1 = new TSPVO();
		tspvo1.setMessage("This is TSP Germany");
		tspvo1.setLocation("Germany");
		tspvo1.setName("TSP");
		
		return new ResponseEntity<TSPVO>(tspvo1,httpHeaders,HttpStatus.OK);
	}
}
