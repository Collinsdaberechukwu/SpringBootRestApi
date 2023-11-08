package com.example.springbootrestapi.Common.controller;

import com.example.springbootrestapi.domain.model.AppUser;
import com.example.springbootrestapi.domain.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppUserController {

    @GetMapping("appUser")
    public AppUser getAppUser(){
        AppUser appUser = new AppUser(
                1,
                "collins",
                "Romeo"
        );
        return appUser;
    }

    @GetMapping("/getStudents")
    public List<AppUser> getStudents(){
        List<AppUser> students = new ArrayList<>();
        students.add(new AppUser(1,"frank","James"));
        students.add(new AppUser(2,"Gideon","Set"));
        return students;
    }
}
