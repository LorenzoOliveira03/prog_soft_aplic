package com.example.springboot.Controllers.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.data.StudentsRepository;
import com.example.springboot.entities.Student;

@RestController
public class GetStudentByMatriculaController {

	@GetMapping("/student/{matricula}")
	public Student getAll(@PathVariable("matricula") String matricula) {
		return StudentsRepository.getStudent(matricula);
	}

}
