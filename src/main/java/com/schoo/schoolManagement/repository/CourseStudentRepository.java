package com.schoo.schoolManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schoo.schoolManagement.model.CourseStudent;

@Repository
public interface CourseStudentRepository extends JpaRepository<CourseStudent,Long> {

	List<CourseStudent>  findByCourseInstructorId(Long instructorid);
	List<CourseStudent>  findByStudentId(Long studentid);
	
	
}
