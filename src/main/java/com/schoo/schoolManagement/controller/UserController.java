package com.schoo.schoolManagement.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoo.schoolManagement.model.CourseStudent;
import com.schoo.schoolManagement.model.Role;
import com.schoo.schoolManagement.model.UserInfo;
import com.schoo.schoolManagement.repository.CourseStudentRepository;
import com.schoo.schoolManagement.repository.UserInfoRepository;
import com.schoo.schoolManagement.service.CouserServiceImp;

@RestController
public class UserController {
	
	@Autowired 
	 private UserInfoRepository userRepository;
	@Autowired
	private CourseStudentRepository courseStudentRepository;
	@Autowired
	private CouserServiceImp  couserServiceImp;
	 
	
	@GetMapping("/api/user/login")  
	public ResponseEntity<?>  getUser(Principal principal)
	{
		if(principal==null)
		 {
			   return ResponseEntity.ok(principal);
			
		  }
		
	       return new ResponseEntity<> ( userRepository.findByUserName(principal.getName()), HttpStatus.OK);         		
		
	}
	
	@PostMapping("/api/user/register")
	public ResponseEntity<?>  registration(@RequestBody  UserInfo userInfo )
	{
		if(userRepository.findByUserName(userInfo.getUserName())!=null)
		{
			 return new ResponseEntity<>(HttpStatus.CONFLICT);
			
		}
		
		userInfo.setRole(Role.STUDENT);
    	return new ResponseEntity<>(userRepository.save(userInfo),HttpStatus.CREATED);
		 
		
	}
	
	
	@PostMapping("/api/user/enroll")
	public ResponseEntity<?>  userCourseEnroll(@RequestBody CourseStudent  courseStudent)
     {
		
	  return new ResponseEntity<>(courseStudentRepository.save(courseStudent),HttpStatus.CREATED);
		
		
	  }
	
	@GetMapping("/api/user/courses")
	public ResponseEntity<?>  getAllCourses()
	{
		return new ResponseEntity<> (couserServiceImp.getAllCourses(),HttpStatus.OK);
		
	}
	
	
	
	
	
	
	

}
