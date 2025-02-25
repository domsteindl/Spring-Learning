package com.example.web;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WebApplicationTests {

	@Test
	void contextLoads() {
	}

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void greetingShouldReturnDefaultMessage() {
        ResponseEntity<Greeting> response = restTemplate.getForEntity("/greeting", Greeting.class);
        Assertions.assertNotNull(response.getBody());
        assertThat(response.getBody().content()).isEqualTo("Hello, World!");
    }

    @Test
    void farewellShouldReturnMorningMessage() {
        ResponseEntity<Farewell> response = restTemplate.getForEntity("/farewell?name=Dominik&timeOfDay=morning", Farewell.class);
        Assertions.assertNotNull(response.getBody());
        assertThat(response.getBody().message()).isEqualTo("Have a great morning, Dominik!");
    }

}
