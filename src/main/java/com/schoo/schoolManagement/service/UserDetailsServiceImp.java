package com.schoo.schoolManagement.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.schoo.schoolManagement.model.UserInfo;
import com.schoo.schoolManagement.repository.UserInfoRepository;

public class UserDetailsServiceImp  implements UserDetailsService{

	 @Autowired
	 private UserInfoRepository  userinfoRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		UserInfo userinfo=userinfoRepository.findByUserName(username).orElse(null);
		
		 if(userinfo==null)
		 {
			 
			 throw new UsernameNotFoundException(username);
		 }
		
		   
		 Set<GrantedAuthority> authorities=new HashSet<>();
		 
		 authorities.add(new SimpleGrantedAuthority(userinfo.getRole().name()));
		 
		 
		
		 return new User(userinfo.getUserName(),userinfo.getUserPassword(),authorities);
		 
		 
		 
		 
		 
		
	}

}
