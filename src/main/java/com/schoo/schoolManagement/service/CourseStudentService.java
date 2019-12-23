package com.schoo.schoolManagement.service;

import java.util.List;

import com.schoo.schoolManagement.model.CourseStudent;

public interface CourseStudentService {
	
	public  CourseStudent  saveCourseStudent(CourseStudent courseStudent);
	
	public List<CourseStudent> findAllEnrollments();
	
	 public List<CourseStudent>  findAllCoursesOfStudent(long studentid);
	 public List<CourseStudent>  findAllStudentOfInsturctor(long instructorid);
	
	

}
