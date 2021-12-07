package com.greatlearning.collegedebate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.collegedebate.entities.Student;

@Service
public interface StudentService {
	
	public void save(Student student);
	
	public List<Student> findAll();
	
	public Student findById(long id);
	
	public void deleteById(long id);
	

}
