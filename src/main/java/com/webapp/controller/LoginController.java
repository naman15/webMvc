package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController 
{
	
	@RequestMapping(value="/login")
	public String getloginForm()
	{
		return "login";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String postloginForm(@RequestParam String name, @RequestParam String Password,ModelMap model)
	{
		if(name.equalsIgnoreCase("Naman") && Password.equalsIgnoreCase("naman")) 
		{
			model.put("name", name);
			return "welcome";
		}
		model.put("errorMessage", "Wrong userName and password");
		return "login";
	}
	
}
