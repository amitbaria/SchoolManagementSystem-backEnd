package com.schoo.schoolManagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoo.schoolManagement.model.Course;
import com.schoo.schoolManagement.repository.CourseRepository;

@Service
@Transactional
public class CouserServiceImp   implements CourseService{
	@Autowired 
	private CourseRepository courseService;


	@Override
	public boolean deleteCourse(long courseId) {
			courseService.deleteById(courseId);
		
		return false;
	}

	  @Override
	public Course udateCourse(Course course) {
		Course  cours=courseService.save(course);
		return cours;
	}

	@Override
	public Course addCourse(Course course) {
		courseService.save(course);
		return null;
		}

	 @Override
	public List<Course> getAllCourses() {
	List<Course>  courses=	courseService.findAll();
	return courses;
	}
}
