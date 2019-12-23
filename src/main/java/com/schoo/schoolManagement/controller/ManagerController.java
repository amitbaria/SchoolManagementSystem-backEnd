package com.schoo.schoolManagement.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.schoo.schoolManagement.model.CourseStudent;
import com.schoo.schoolManagement.model.UserInfo;
import com.schoo.schoolManagement.repository.CourseStudentRepository;
import com.schoo.schoolManagement.service.CousreStudentServiceImp;

public class ManagerController {

	@Autowired
	 private CousreStudentServiceImp courseRepository;
	
	
	@GetMapping("/api/manager/enrollments")
	public  ResponseEntity<?> findAllEntrollmentByManager()
	{
		
	           List<CourseStudent>  courseStudents	=courseRepository.findAllEnrollments();
	
	           List<UserInfo> users   = courseStudents.stream().map(n->n.getStudent()).collect(Collectors.toList());
	           
	            return new ResponseEntity<>(users,HttpStatus.OK);
	
		
	}
	
	
}
