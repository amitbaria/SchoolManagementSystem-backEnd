package com.schoo.schoolManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoo.schoolManagement.repository.CourseRepository;

@Service
public class CouserServiceImp {
	@Autowired 
	private CourseRepository courseService;
}
