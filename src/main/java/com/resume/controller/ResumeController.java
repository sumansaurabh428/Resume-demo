package com.resume.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Resume/")
public class ResumeController {
	
	@GetMapping("value")
	public String getValue() {
		return "Resume string";
	}

}
