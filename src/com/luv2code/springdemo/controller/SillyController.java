package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 2- explaining request mapping

@Controller
@RequestMapping("/silly")
public class SillyController {

	// need a controller method to show the initial HTML form.
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	

	@RequestMapping("/processFormV3")
	public String processFormVersionThree(@RequestParam("studentName") String studentName,@RequestParam("studentPassword") String studentPassword, Model model) {


		// convert the data to upper case 
		// Do your logic
		studentName = studentName.toUpperCase();
		studentPassword = studentPassword.toUpperCase();

		int len = studentPassword.length();
		System.out.println(len);
		// add the message to the model
		model.addAttribute("studentName", studentName);
		model.addAttribute("studentPassword", studentPassword);
		model.addAttribute("len", len);

		return "process-data-v3";
	}
}
