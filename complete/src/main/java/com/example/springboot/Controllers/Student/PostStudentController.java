package com.example.springboot.Controllers.Student;

import java.util.Random;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.data.StudentsRepository;
import com.example.springboot.entities.Student;

@RestController
public class PostStudentController {

	@PostMapping("/student")
	public Student insert(@RequestBody Student student) {
        StudentsRepository.addStudent(student);
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        student.setMatricula(id);
        return student;
	}

}
