package com.jenkins.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class MainController {
	
	@GetMapping("/hello")
	public String helloJenkins() {
		return "This my first jenkins tutorials";
	}

}
