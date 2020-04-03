package com.github.frozen00000.hydra;

import lombok.RequiredArgsConstructor;

import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Hello {

	private final BuildProperties buildProperties;

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@GetMapping("/version")
	public String version() {
		return buildProperties.getVersion();
	}

}
