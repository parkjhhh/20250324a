package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCDController {
	@GetMapping("fisa1")
	
	public String reqRes() {
		System.out.println("reqRes() ********");
		
		return "요청성공";
	}
}
