package com.school.schoolManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.schoolManagement.dao.SchoolRepo;
import com.school.schoolManagement.model.School;

@Service
public class SchoolService {

	@Autowired
	SchoolRepo schoolRepo;
	
	public List<School> getSchools(){
		return schoolRepo.findAll();
	}
}
