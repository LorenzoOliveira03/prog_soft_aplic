package com.example.springboot.Controllers.Student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.data.StudentsRepository;
import com.example.springboot.entities.Student;

@RestController
public class GetAllStudentsController {

	@GetMapping("/student/all")
	public List<Student> getAll() {
		return StudentsRepository.getAllStudents();
	}

}
