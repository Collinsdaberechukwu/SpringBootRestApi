package com.example.springbootrestapi.Common.controller;

import com.example.springbootrestapi.domain.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

                // this class java RESTapi that return Json to the client
    @GetMapping("student ")
    public Student getStudent(){
        Student students = new Student(
                "Collins",
                "Daniel",
                "collinsdaberechi20@gmail.com"
        );
        return students;
    }
     @GetMapping("newStudent")
    public List<Student> getAddedStudent(){
     List<Student> newStudent = new ArrayList<>();
     newStudent.add(new Student("Doris","Christ","Doris@Gmail.com"));
     newStudent.add(new Student("Oluchi","Rose","oluchi@gmail.com"));
     return newStudent;
    }

}
