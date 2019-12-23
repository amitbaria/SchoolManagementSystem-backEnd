package com.schoo.schoolManagement.service;

import java.util.List;
import java.util.Optional;

import com.schoo.schoolManagement.model.Course;

public interface CourseService {
	
	
	 public  List<Course>  getAllCourses();
	 public  boolean deleteCourse(long courseId);
	 public  Course  udateCourse(Course course);
	 public    Course  addCourse(Course course);
	 

}
