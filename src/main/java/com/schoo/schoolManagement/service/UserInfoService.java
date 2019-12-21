package com.schoo.schoolManagement.service;

import java.util.List;
import java.util.Optional;

import com.schoo.schoolManagement.model.UserInfo;

public interface UserInfoService {
	
	public UserInfo saveUserInforamation(UserInfo user);
	
	public List<UserInfo>  getAllUsers();
	public Optional<UserInfo> getUserByName(String userName);
	public UserInfo updateUserInfo(UserInfo user);

}
