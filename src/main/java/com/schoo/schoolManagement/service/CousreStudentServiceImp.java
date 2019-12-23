package com.schoo.schoolManagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoo.schoolManagement.model.CourseStudent;
import com.schoo.schoolManagement.repository.CourseRepository;
import com.schoo.schoolManagement.repository.CourseStudentRepository;

@Service
@Transactional
public class CousreStudentServiceImp  implements CourseStudentService{
	
	 @Autowired
	 private CourseStudentRepository courseRepository;

	@Override
	public CourseStudent saveCourseStudent(CourseStudent courseStudent) {
		
          return 	courseRepository.save(courseStudent);
	
	}

	@Override
	public List<CourseStudent> findAllEnrollments() {
		       
		List<CourseStudent> c=	courseRepository.findAll();
		return c;
	}

	@Override
	public List<CourseStudent> findAllCoursesOfStudent(long studentid) {
		
		List<CourseStudent> courses=	courseRepository.findByStudentId(studentid);
		return courses;
		}

	@Override
	public List<CourseStudent> findAllStudentOfInsturctor(long insturctorid) {
		   
	 List<CourseStudent> courseInstuructors= 	courseRepository.findByCourseInstructorId(insturctorid);
	 return courseInstuructors;
	}
	

   

	   
	 
	 
	 
	 
}
