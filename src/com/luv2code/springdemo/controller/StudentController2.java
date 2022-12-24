package com.luv2code.springdemo.controller;

import com.luv2code.springdemo.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//3- explain spring with MVC Form tags
//   use student-view-with-mvc-tags folder

@Controller
@RequestMapping("/student2")
public class StudentController2 {

	@RequestMapping("/showForm")
	public String showStudentForm(Model model) {
		//create student object
		Student student = new Student();
		// add student object to the model
		model.addAttribute("student", student);
		return "student-view-with-mvc-tags/student-form";
		// when form is loaded spring MVC will call getter method -student.getName(); -student.getAge();
		// when form is submitted spring MVC will call setter method -student.setName(); -student.setAge();
	}

	@RequestMapping("/studentDataV1")
	public String ShowStudentDataV1(@ModelAttribute("student") Student student) {

		
		return "student-view-with-mvc-tags/student-data-v1";
	}


}
