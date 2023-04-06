package com.example.springboot.data;

import com.example.springboot.entities.Student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Student, Long>{

    List<Student> findByName(String name);

	Student findByMatricula(Long id);
}