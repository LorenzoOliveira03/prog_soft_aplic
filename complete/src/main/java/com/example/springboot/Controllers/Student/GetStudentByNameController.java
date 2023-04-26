package com.example.springboot.Controllers.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.Student;
import com.example.springboot.Repository.StudentsRepository;

@RestController
public class GetStudentByNameController {

    private final StudentsRepository studentsRepository;

    @Autowired
    public GetStudentByNameController(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @GetMapping("/student/search/{name}")
    public List<Student> getAll(@PathVariable("name") String name) {
        List<Student> students = (List<Student>) studentsRepository.findByName(name);

        return students;

    }

}
