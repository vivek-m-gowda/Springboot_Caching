package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
