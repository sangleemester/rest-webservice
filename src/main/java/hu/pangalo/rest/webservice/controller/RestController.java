package hu.pangalo.rest.webservice.controller;


import hu.pangalo.rest.webservice.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

	private static final Logger logger = LoggerFactory.getLogger(RestController.class);

	@Autowired
	CounterService counterService;

	@GetMapping
	public ResponseEntity<String> helloWorld() {
		Integer counter = counterService.incrementCounter();
		logger.info("counter: " + counter);
		return ResponseEntity.ok("Hello World! in-memory counter: " + counter);
	}
}
