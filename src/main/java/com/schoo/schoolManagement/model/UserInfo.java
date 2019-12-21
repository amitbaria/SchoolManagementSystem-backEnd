package com.schoo.schoolManagement.model;

//import lombok.Data;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data // for Lombok annotation , for  setter getter , hasCode and equals Method
@Entity
@Table(name="USERINFO")
public class UserInfo   {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
    @Column(name="USERNAME")
    private String userName;
	
    @Getter @Setter 
    @Column(name="PASSWORD")
    private String userPassword;

     
    @Enumerated(EnumType.STRING)
    @Column(name="ROLE")
    private Role role;


	
    
   
    


}
