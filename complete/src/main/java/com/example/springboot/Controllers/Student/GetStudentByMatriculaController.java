package com.example.springboot.Controllers.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.Student;
import com.example.springboot.Repository.StudentsRepository;

@RestController
public class GetStudentByMatriculaController {

	private final StudentsRepository studentsRepository;

	@Autowired
	public GetStudentByMatriculaController(StudentsRepository studentsRepository) {
		this.studentsRepository = studentsRepository;
	}

	@GetMapping("/student/{matricula}")
	public Student getAll(@PathVariable("matricula") Long matricula) {
		Student student = studentsRepository.findByMatricula(matricula);

		return student;
	}

}
