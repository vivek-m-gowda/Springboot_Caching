package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.entity.Student;
import com.spring.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Object> saveOrUpadte(@RequestBody Student student){
		return new ResponseEntity(studentService.saveOrUpadte(student), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Object> update(@RequestBody Student student){
		return new ResponseEntity(studentService.saveOrUpadte(student), HttpStatus.OK);
	}
	
	@GetMapping("/allStudent")
	public List<Student> listAllStudent(){
		return studentService.listAllStudent();
	}
	
	@GetMapping("/findById")
	public ResponseEntity<Object> getStudentById(@RequestParam Long id){
		return new ResponseEntity(studentService.getStudentById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public  ResponseEntity<Object> deleteStudent(@RequestParam Long id){
		studentService.deleteStudent(id);
		return new ResponseEntity<>("Student Deleted", HttpStatus.OK);
	}
}
