package com.example.springboot.Controllers.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.data.StudentsRepository;
import com.example.springboot.entities.Student;

@RestController
public class GetStudentByNameController {

    @GetMapping("/student/search/{name}")
    public List<Student> getAll(@PathVariable("name") String name) {
        List<Student> students = StudentsRepository.getAllStudents();
        List<Student> studentsFound = new ArrayList<>();

        for (Student student : students) {
            if (student.getName().contains(name)) {
                studentsFound.add(student);
            }
        }

        return studentsFound;

    }

}
