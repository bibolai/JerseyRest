package com.bibo.rest.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/test")
	public  String test() {
		return "heartbeat.. alive";
	}
}
