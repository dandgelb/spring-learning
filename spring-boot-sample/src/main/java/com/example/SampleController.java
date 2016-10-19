package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
	@RequestMapping
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/")
	public String helloWorld(
			@RequestParam(value = "username", required = false, defaultValue = "World") String username, Model model) {
		model.addAttribute("username", username);
		return "index";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}
