package com.schoo.schoolManagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.schoo.schoolManagement.model.UserInfo;
import com.schoo.schoolManagement.repository.CourseRepository;
import com.schoo.schoolManagement.repository.UserInfoRepository;

@Service
@Transactional
public class UserInfoServiceImp implements UserInfoService{
	@Autowired 
	private UserInfoRepository userInfoRepository;
	
	@Autowired
     private  PasswordEncoder passwordEncoder;
	
	

	@Override
	public UserInfo saveUserInforamation(UserInfo user) {
		 
		user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
		
		
		    UserInfo info=userInfoRepository.save(user);
		     return info;
	}

	@Override
	public List<UserInfo> getAllUsers() {
		 List<UserInfo> userInfo= userInfoRepository.findAll();
		  return userInfo;
	}

	@Override
	public Optional<UserInfo> getUserByName(String userName) {
	Optional<UserInfo> userinfo	=userInfoRepository.findByUserName(userName);
	  return userinfo;
	  //comment
		
	}

	@Override
	public UserInfo updateUserInfo(UserInfo user) {
		UserInfo user1=userInfoRepository.save(user);
		
		return user1;
	}
	
	
	
	
}
