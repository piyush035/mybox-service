package com.mybox.auth.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mybox.auth.service.SecurityService;
import com.mybox.auth.service.UserService;
import com.mybox.auth.validator.UserValidator;

@RestController
public class RestUserController {
	@Autowired
	private UserService userService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private UserValidator userValidator;
	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	public String auth(String userName, String password) {
		securityService.autoLogin(userName, password);
		return "login";
	}
}
