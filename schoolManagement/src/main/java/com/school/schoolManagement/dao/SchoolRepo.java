package com.school.schoolManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.schoolManagement.model.School;

@Repository
public interface SchoolRepo extends  JpaRepository<School, Integer>{

}
