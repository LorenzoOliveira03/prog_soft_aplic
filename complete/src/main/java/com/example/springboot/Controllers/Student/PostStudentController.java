package com.example.springboot.Controllers.Student;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.data.StudentsRepository;
import com.example.springboot.entities.Student;
 
@RestController
public class PostStudentController {

        private final StudentsRepository studentsRepository;

        @Autowired
        public PostStudentController(StudentsRepository studentsRepository) {
            this.studentsRepository = studentsRepository;
        }

	@PostMapping("/student")
	public Student insert(@RequestBody Student student) {
        Student stu = studentsRepository.save(student);
        
        return stu;
	}

}
