package org.example.controller;

import org.example.annotation.Controller;
import org.example.annotation.Inject;
import org.example.service.UserService;

@Controller
public class UserController {
	private final UserService userService;
	
	@Inject // my DI framework
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * DI가 되었다면 null이 아닌, userService 객체가 반환될 것이다
	 */
	public UserService getUserService() {
		return userService;
	}
}
