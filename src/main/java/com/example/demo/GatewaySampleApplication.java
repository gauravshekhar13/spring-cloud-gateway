package com.example.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.mvc.ProxyExchange;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;


@RestController
@SpringBootApplication
@Slf4j
public class GatewaySampleApplication {
	
	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(GatewaySampleApplication.class);

	@Value("http://localhost:8081")
	private URI homeAsiaPacific;
	
	@Value("http://localhost:8082")
	private URI homeEurope;
	
	
	@PostMapping("/callGeneric")
	  public ResponseEntity<?> callGenericService(@RequestBody GenericService genericTSP,ProxyExchange<Object> proxy) {
		
		ResponseEntity<?> rs = null;
		if(genericTSP.getTokenId().equals("11")) {
			
			log.info("in proxy method");
			log.info("URL is:" + homeAsiaPacific.toString());
			rs = proxy.uri(homeAsiaPacific.toString() + "/asiapacific/myserviceIndia").get();
		}
		
		if(genericTSP.getTokenId().equals("12")) {
			rs = proxy.uri(homeEurope.toString() + "/europe/myserviceTurkey").get();
		}
		
	    return rs;
	  }

	@GetMapping("/callIndia")
	public ResponseEntity<?> proxyIndia(ProxyExchange<Object> proxy) throws Exception {

		log.info("in proxy method");
		log.info("URL is:" + homeAsiaPacific.toString());
		return proxy.uri(homeAsiaPacific.toString() + "/asiapacific/myserviceIndia").get();
	}
	
	@GetMapping("/callChina")
	public ResponseEntity<?> proxyJapan(ProxyExchange<Object> proxy) throws Exception {

		log.info("in proxy method");
		log.info("URL is:" + homeAsiaPacific.toString());
		return proxy.uri(homeAsiaPacific.toString() + "/asiapacific/myserviceChina").get();
	}
	
	@GetMapping("/callTurkey")
	public ResponseEntity<?> proxyTurkey(ProxyExchange<Object> proxy) throws Exception {

		log.info("in proxy method");
		log.info("URL is:" + homeEurope.toString());
		return proxy.uri(homeEurope.toString() + "/europe/myserviceTurkey").get();
	}
	
	@GetMapping("/callGermany")
	public ResponseEntity<?> proxyGermany(ProxyExchange<Object> proxy) throws Exception {

		log.info("in proxy method");
		log.info("URL is:" + homeEurope.toString());
		return proxy.uri(homeEurope.toString() + "/europe/myserviceGermany").get();
	}

}
