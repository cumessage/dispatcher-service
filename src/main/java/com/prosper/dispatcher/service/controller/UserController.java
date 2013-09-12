package com.prosper.dispatcher.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register() {
		return "success";
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login() {
		return "success";
	}

}
