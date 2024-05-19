package com.mg.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mg.sms.entity.Student;
import com.mg.sms.repo.StudentRepositary;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepositary studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> student = studentRepo.findAll();
		return student;
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
			return studentRepo.findById(id).get();
	
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		 studentRepo.deleteById(id);
		
	}

	
}
