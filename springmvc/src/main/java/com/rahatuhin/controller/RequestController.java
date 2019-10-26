package com.rahatuhin.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rahatuhin.entity.Student;

@Controller("/")
public class RequestController {

	// Blank Request Mapping
	@RequestMapping("/")
	public String blankMapping() {
		System.out.println("Tuhin form");
		return "form";
	}

	// path variable mapping
	@RequestMapping("/pathVariableMapping/{id}")
	public String pathVariableMapping(@PathVariable String id) {
		System.out.println("Tuhin form :: " + id);
		return "form";
	}

	// request param mapping
	@RequestMapping("/requestparamMapping/{id}")
	public String requestparamMapping(@PathVariable String id, @RequestParam("name") String name) {
		System.out.println("Tuhin form :: " + id + name);
		return "form";
	}

	// request body mapping
	@RequestMapping("/requestbodyMapping")
	public String requestBodyMapping(@RequestBody(required = false) String body) {
		System.out.println("Tuhin form :: " + body);
		return "form";
	}

	// Blank Request Mapping
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		System.out.println("Showing form");
		return "student_form";
	}

	// Blank Request Mapping
	@RequestMapping("/processForm")
	public String showForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult result) {
		System.out.println(theStudent.getFirstName());
		System.out.println(theStudent.getLastName());
		
		if(result.hasErrors()) {
			System.out.println("form had errors");
			System.out.println(result);
			return "student_form";
		}
		System.out.println(result);
		return "form";
	}

}
