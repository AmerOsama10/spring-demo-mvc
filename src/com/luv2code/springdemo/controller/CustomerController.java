package com.luv2code.springdemo.controller;

import javax.validation.Valid;

import com.luv2code.springdemo.model.Customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//3- explain validation

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showStudentForm(Model model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "student-view-with-validation/customer-form";

	}

	@RequestMapping("/processValidation")
	public String processValidation(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult theBindingResult) {

		if (theBindingResult.hasErrors())
			return "student-view-with-validation/customer-form";
		else
			return "student-view-with-validation/customer-data";

	}

}
