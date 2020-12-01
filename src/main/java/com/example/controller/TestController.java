package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test/jenkins")
public class TestController {
	@ApiOperation(value = "테스트 메소드")
	@GetMapping(value = "/")
	public String testMethod() {
		return "Hello jenkins!!!!";
	}
}
