package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import com.spring.demo.entity.Student;

public interface StudentService {
	
	Student saveOrUpadte(Student student);
	List<Student> listAllStudent();
	Optional<Student> getStudentById (Long id);
	void deleteStudent(Long id);
}
