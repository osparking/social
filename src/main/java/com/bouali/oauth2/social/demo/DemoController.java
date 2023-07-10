package com.bouali.oauth2.social.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
	@GetMapping
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("안녕-안전한 종점이야.");
	}
}
