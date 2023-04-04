package com.example.springboot.data;

import java.util.ArrayList;
import java.util.List;

import com.example.springboot.entities.Student;

public class StudentsRepository{
    private static List<Student> students = new ArrayList<>();

    public static List<Student> getAllStudents(){
        return students;
    }

    public static void addStudent(Student student){
        students.add(student);
    }

    public static void removeStudent(Student student){
        students.remove(student);
    }

    public static Student getStudent(String matricula){
        for(Student student : students){
            if(student.getMatricula().equals(matricula)){
                return student;
            }
        }
        return null;
    }
}