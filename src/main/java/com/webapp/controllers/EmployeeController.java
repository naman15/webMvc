package com.webapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webapp.dataRepository.interfaces.EmployeeDataRepository;
import com.webapp.entities.Employee;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeDataRepository employeeDataRepo;
	
	@RequestMapping(value="/getAllEmployees",method=RequestMethod.GET)
	public String getloginForm(Model model)
	{
		List<Employee> employee=employeeDataRepo.findAll();
		model.addAttribute("employeeList", employee);
		return "employeeDetails";
	}
	
//	@RequestMapping(value="/login" , method=RequestMethod.POST)
//	public String postloginForm(@RequestParam String name, @RequestParam String Password,ModelMap model)
//	{
//		if(name.equalsIgnoreCase("Naman") && Password.equalsIgnoreCase("naman")) 
//		{
//			model.put("name", name);
//			return "welcome";
//		}
//		model.put("errorMessage", "Wrong userName and password");
//		return "login";
//	}
	
}
