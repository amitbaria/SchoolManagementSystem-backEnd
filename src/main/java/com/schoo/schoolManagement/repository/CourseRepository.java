package com.schoo.schoolManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schoo.schoolManagement.model.Course;
import com.schoo.schoolManagement.model.CourseStudent;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
