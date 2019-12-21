package com.schoo.schoolManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schoo.schoolManagement.model.CourseStudent;
import com.schoo.schoolManagement.model.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long>{

	 Optional<UserInfo>  findByUserName(String username);
	
}
