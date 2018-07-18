package com.rd.controller;


import com.rd.pojo.User;
import com.rd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {

	@Autowired
	private UserService userServiceImpl;

	@RequestMapping("/show")
	@ResponseBody
	public List<User> show(Model model){
		model.addAttribute("list", userServiceImpl.show());
		return userServiceImpl.show();
	}

	@RequestMapping(value = "/updUser")
	@ResponseBody
	public String updUser(User user){
		int i = userServiceImpl.updUser(user);
		if (i>0){
			return "ok";
		}else {
			return "异常";
		}
	}
	@RequestMapping(value = "/test")
	@ResponseBody
	public int test(){
		return 1;
	}
}
