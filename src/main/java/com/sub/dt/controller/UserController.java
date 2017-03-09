package com.sub.dt.controller;

import com.sub.dt.pojo.User;
import com.sub.dt.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.selectByUserNum(null);
		model.addAttribute("user", user);
		return "showUser";
	}


	@RequestMapping("/test")
	public String test(User user,Model model){
		User userDb = this.userService.selectByUserNum(user);
		model.addAttribute("user", userDb);
		return "showUser";
	}
}
