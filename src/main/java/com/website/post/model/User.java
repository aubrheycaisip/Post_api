package com.website.post.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.website.post.enums.GenderName;
import com.website.post.util.DateAudit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User extends DateAudit{

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	private Long birthday;
	
	private String address;
	
	private String email;
	
	private String username;
	
	private String password;
	
	@OneToMany(mappedBy="user")
	private Set<Post> posts; 
	
	@Enumerated(EnumType.STRING)
	private GenderName gender = GenderName.Unknown;
	
}
