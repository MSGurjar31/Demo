package com.mg.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mg.sms.entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Long>{

	
}
