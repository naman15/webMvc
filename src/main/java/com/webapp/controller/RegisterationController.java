package com.webapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterationController 
{
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	public String getNewUserForm()
	{
		return "newUserForm";
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.POST)
	public void registerUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name");
		String password = request.getParameter("Password");
		request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request, response);
	}
	
}
