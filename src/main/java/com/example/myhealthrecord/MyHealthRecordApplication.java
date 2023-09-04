package com.example.myhealthrecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyHealthRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHealthRecordApplication.class, args);
	}

	@Controller
	public static class HomeController {
		@GetMapping("/")
		public String home() {
			return "src/main/resources/templates/add-patient"; // Return the HTML file name without the extension
		}
	}
}
