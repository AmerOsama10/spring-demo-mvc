package com.luv2code.springdemo.mvc.controller;

import javax.validation.Valid;

import com.luv2code.springdemo.mvc.model.Customer;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//3- explain validation

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//Pre process all web requests into our controller
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		//defined in spring API
		//removes white space leading and trailing
		//true means trim to null if it entirely all white space
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showStudentForm(Model model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "student-view-with-validation/customer-form";

	}

	@RequestMapping("/processValidation")
	public String processValidation(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult theBindingResult) {

			System.out.println("theBindingResult is : " +theBindingResult);
		if (theBindingResult.hasErrors())
			return "student-view-with-validation/customer-form";
		else
			return "student-view-with-validation/customer-data";

	}

	

}
