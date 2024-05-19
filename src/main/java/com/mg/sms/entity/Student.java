package com.mg.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity

//@Table(name = "Students")  //It is optional if not provide then consider class name as table name
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@NonNull
	//@Column(name = "first_Name")  //optional 
	private String firstName;
	
	@NonNull
	//@Column(name = "last_Name")  //optional
	private String lastName;
	
	@NonNull
	//@Column(name = "email")  	//optional
	private String email;
	
	
}
