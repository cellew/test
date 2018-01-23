package com.eduask.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduask.model.User;
import com.eduask.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final String SUCCESS = "success";
	private static final String INDEX = "index";
	@Resource(name = "service")
	private UserService service;

	@RequestMapping("/reg")
	public String addUser(User user) {

		int rows = service.insert(user);
		if (rows > 0) {
			return SUCCESS;
		}

		return INDEX;
	}
}
