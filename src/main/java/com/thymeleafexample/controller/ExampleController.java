package com.thymeleafexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

	@RequestMapping("/example/novo")
	public String nova() {
		return "example/ExampleController";
	}
	
}
