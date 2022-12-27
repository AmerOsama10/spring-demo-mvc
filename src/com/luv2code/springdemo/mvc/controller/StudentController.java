package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//2- explain spring without MVC Form tags
//   use student-view-without-mvc-tags folder

@Controller
@RequestMapping("/student")
public class StudentController {

	// need a controller method to show the initial HTML form.
	@RequestMapping("/showForm")
	public String showStudentForm() {
		return "student-view-without-mvc-tags/student-form";
	}
	
	
	@RequestMapping("/studentDataV1")
	public String ShowStudentDataV2(@RequestParam("studentName") String studentName,@RequestParam("studentAge") String studentAge,@RequestParam("studentGender") String studentGender, Model model) {
		
		//make some logic
		studentName=studentName.toUpperCase();
		studentAge=studentAge.toUpperCase();
		studentGender=studentGender.toUpperCase();
		
		//1- we can use parameters @RequestParam to send data to page
		
		//2- we can use attributes to send data to page
		model.addAttribute("studentName", studentName);
		model.addAttribute("studentAge", studentAge);
		model.addAttribute("studentGender", studentGender);
		
		//3- we can use object to send data to page
		Student student = new Student();
		student.setName(studentName);
		student.setAge(studentAge);
		student.setGender(studentGender);
		model.addAttribute("student", student);

		return "student-view-without-mvc-tags/student-data-v1";
	}
}
