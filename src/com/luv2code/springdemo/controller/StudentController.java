package com.luv2code.springdemo.controller;

import com.luv2code.springdemo.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//2- explain spring without MVC Form tags

@Controller
@RequestMapping("/student")
public class StudentController {

	// need a controller method to show the initial HTML form.
	@RequestMapping("/showForm")
	public String showStudentForm() {
		return "student-view/student-form";
	}
	

	@RequestMapping("/studentDataV1")
	public String ShowStudentDataV1(@RequestParam("studentName") String studentName,@RequestParam("studentAge") String studentAge,@RequestParam("studentGender") String studentGender, Model model) {


		// convert the data to upper case 
		// Do your logic
		studentName = studentName.toUpperCase();
		studentAge = studentAge.toUpperCase();
		studentGender = studentGender.toUpperCase();

		
		// add the message to the model
		model.addAttribute("studentName", studentName);
		model.addAttribute("studentAge", studentAge);
		model.addAttribute("studentGender", studentGender);

		return "student-view/student-data-v1";
	}
	
	@RequestMapping("/studentDataV2")
	public String ShowStudentDataV2(@RequestParam("studentName") String studentName,@RequestParam("studentAge") String studentAge,@RequestParam("studentGender") String studentGender, Model model) {


		Student s = new Student();
		s.setName(studentName);
		s.setAge(studentAge);
		s.setGender(studentGender);

		//adding every variable
		model.addAttribute("studentName", studentName);
		model.addAttribute("studentAge", studentAge);
		model.addAttribute("studentGender", studentGender);

		//add the object 
		model.addAttribute("student", s);
		
		return "student-view/student-data-v2";
	}
}
