package com.school.schoolManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.schoolManagement.model.School;

@RestController
public class SchoolController {

	@GetMapping(value = "/school")
	public School getSchool() {
		School school = new School();
		school.setLocation("Rourkela");
		school.setSchoolId(1);
		school.setSchoolName("Saraswati Shishu Vidya Mandir");
		return school;
	}

}
