package com.luv2code.springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloworldController {

	// need a controller method to show the default or home page.
	@RequestMapping("/")
	public String mainMenu() {
		return "main-menu";
	}

	// need a controller method to show the initial HTML form.
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}

	// need a controller method to process the HTML form.
	@RequestMapping("/processFormV1")
	public String processForm() {
		return "process-data-v1";
	}

	// new a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormV2")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {

		// read the request parameter from the html form
		String studentName = request.getParameter("studentName");
		String studentPassword = request.getParameter("studentPassword");

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

		return "process-data-v2";
	}
	
	// RequestParam -> spring will do it for us  String theName = request.getParameter("studentName");
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
