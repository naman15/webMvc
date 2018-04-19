package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController 
{
	
	@RequestMapping(value="/login")
	public String getloginForm()
	{
		return "login";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	@ResponseBody
	public String postloginForm()
	{
		return "Hello Naman";
	}
	
}
