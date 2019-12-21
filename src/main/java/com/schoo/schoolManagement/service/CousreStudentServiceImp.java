package com.schoo.schoolManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoo.schoolManagement.repository.CourseRepository;
import com.schoo.schoolManagement.repository.CourseStudentRepository;

@Service
public class CousreStudentServiceImp {
	
	 @Autowired
	 private CourseStudentRepository courseRepository;

}
