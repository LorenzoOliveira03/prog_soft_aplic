package com.example.springboot.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.Entity.Student;

public interface StudentsRepository extends CrudRepository<Student, Long>{

    List<Student> findByName(String name);

	Student findByMatricula(Long id);
}