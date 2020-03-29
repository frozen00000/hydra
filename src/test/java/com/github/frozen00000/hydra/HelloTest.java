package com.github.frozen00000.hydra;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloTest {

	@Autowired
	private TestRestTemplate template;

	@Test
	public void exampleTest() {
		assertEquals("Hello", template.getForObject("/api/hello", String.class));
	}

}