package com.jenkins.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class MainController {
	
	public String helloJenkins() {
		return "Adding extra logs";
	}

}
