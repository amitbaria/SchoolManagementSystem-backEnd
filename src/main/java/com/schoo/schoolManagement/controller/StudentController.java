package com.schoo.schoolManagement.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoo.schoolManagement.model.Course;
import com.schoo.schoolManagement.model.CourseStudent;
import com.schoo.schoolManagement.service.CousreStudentServiceImp;

@RestController
public class StudentController {
	
	@Autowired
private	CousreStudentServiceImp  cousreStudentServiceImp;
	//1.  student can view all courses by student id
	
	
	@GetMapping("/api/student/courses/{studentid}")
	public ResponseEntity<?>  viewStudentCourses(@PathVariable  long studentid)
	{
		
       List<CourseStudent> courseStudents	=	cousreStudentServiceImp.findAllCoursesOfStudent(studentid);
       
       List<Course> courses= courseStudents.stream().map(n-> n.getCourse()  
                                                          ).collect(Collectors.toList());

      return new ResponseEntity<>(courses,HttpStatus.OK);
		
	}
	
	
	
	// 2. student can enroll for courses
	
	@PostMapping("/api/student/course")
	  public ResponseEntity<?>  enrollStudent(@RequestBody CourseStudent  courseStudent)
	  {
	    return new ResponseEntity<>	(cousreStudentServiceImp.saveCourseStudent(courseStudent), HttpStatus.CREATED );
		  
	  }
	
	
	

}
