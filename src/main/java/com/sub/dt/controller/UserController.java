package com.sub.dt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.sub.dt.dbRouting.annotation.Router;
import com.sub.dt.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sub.dt.pojo.User;
import com.sub.dt.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(null);
		model.addAttribute("user", user);
		return "showUser";
	}


	@RequestMapping("/test")
	public String test(UserVo userVo,Model model){
		userVo = new UserVo();
		userVo.setId(1);
		userVo.setUserNum("2323sdf");
		User user = this.userService.getUserById(userVo);
		model.addAttribute("user", user);
		return "showUser";
	}
}
