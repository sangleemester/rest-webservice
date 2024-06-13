package hu.pangalo.rest.webservice.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

	private static final Logger logger = LoggerFactory.getLogger(RestController.class);

	@GetMapping
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Helloooo World!");
	}
}
