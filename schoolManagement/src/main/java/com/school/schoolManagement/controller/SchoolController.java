package com.school.schoolManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.schoolManagement.model.School;
import com.school.schoolManagement.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	SchoolService schoolService;
	
	@GetMapping(value = "/school")
	public List<School> getSchool() {
		return schoolService.getSchools();
	}

}
