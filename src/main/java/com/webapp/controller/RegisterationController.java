package com.webapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterationController 
{
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	public String getNewUserForm()
	{
		return "newUserForm";
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.POST)
	public String registerUser(@RequestParam String name, @RequestParam String Password,ModelMap model) throws ServletException, IOException
	{
		model.put("name", name);
		model.put("password", Password);
		return "welcome";
	}
	
}
