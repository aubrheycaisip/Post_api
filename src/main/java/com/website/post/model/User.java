package com.website.post.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.website.post.enums.GenderName;
import com.website.post.util.DateAudit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends DateAudit<String>{

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private Long birthday;
	
	private String address;
	
	private String email;
	
	private String username;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private GenderName gender = GenderName.Unknown;
	
}
