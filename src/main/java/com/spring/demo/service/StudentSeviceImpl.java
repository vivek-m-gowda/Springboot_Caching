package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.spring.demo.entity.Student;
import com.spring.demo.repository.StudentRepository;

@Service
public class StudentSeviceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveOrUpadte(Student student) {
		return studentRepository.save(student);
	}

	@Override
	@Cacheable(value = "listAllStudent")
	public List<Student> listAllStudent() {
		System.out.println("From BD");
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudentById(Long id) {
		return studentRepository.findById(id);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}