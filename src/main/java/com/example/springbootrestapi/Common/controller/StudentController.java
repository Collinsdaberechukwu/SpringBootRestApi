package com.example.springbootrestapi.Common.controller;

import com.example.springbootrestapi.domain.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class StudentController {

                // this class java RESTapi that return Json to the client
    @GetMapping("student ")
    public Student getStudent(){
        Student students = new Student(
                1L,
                 "Collins",
                "Daniel",
                "collinsdaberechi20@gmail.com"
        );
        return students;
    }

    //this http method returns RESTApi that returns List format in Json
     @GetMapping("newStudent")
    public List<Student> getAddedStudent(){
     List<Student> newStudent = new ArrayList<>();
     newStudent.add(new Student(1l, "Doris","Christ","Doris@Gmail.com"));
     newStudent.add(new Student(2l, "Oluchi","Rose","oluchi@gmail.com"));
     return newStudent;
    }

    //Using @Path Variable to bind id to a request
    @GetMapping("studentPath/{id}")
    public Student studentsPath(@PathVariable  Long studentId, @PathVariable String id){
        return new Student(studentId, "Doris","Christ","Doris@gmail.com");
    }

    @PostMapping("create/student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getEmail());
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        return  student;
    }

    @PutMapping("updateStudent/{id}")
    public Student updateStudents(@RequestBody Student student, @PathVariable Long id){
        System.out.println(student.getId());
        return student;
    }
    @DeleteMapping("deleteStudent")
    public Student deleteStudents(@PathVariable Long id){
        System.out.println("deleted successfully");
        return deleteStudents(id);
    }


}
