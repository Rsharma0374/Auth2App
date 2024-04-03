package com.oAuth2.Auth2App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Auth2AppApplication {

	@GetMapping
	public String welcome() {
		return "   ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥\n" +
				"  ♥                                                 ♥\n" +
				" ♥                  Welcome to                       ♥\n" +
				" ♥                   Auth2App                        ♥\n" +
				"  ♥                                                 ♥\n" +
				"   ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥\n";
	}

	public static void main(String[] args) {
		SpringApplication.run(Auth2AppApplication.class, args);
	}

}
