package com.example.springboot.Controllers.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.data.StudentsRepository;
import com.example.springboot.entities.Student;

@RestController
public class GetAllStudentsController {

	private final StudentsRepository studentsRepository;

	@Autowired
	public GetAllStudentsController(StudentsRepository studentsRepository) {
		this.studentsRepository = studentsRepository;
	}

	@GetMapping("/student/all")
	public List<Student> getAll() {
		List<Student> students = (List<Student>) studentsRepository.findAll();

		return students;
	}

}
