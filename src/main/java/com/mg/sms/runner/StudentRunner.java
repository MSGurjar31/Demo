package com.mg.sms.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mg.sms.service.IStudentService;

@Component
public class StudentRunner implements CommandLineRunner{

	@Autowired
	private IStudentService service;
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
