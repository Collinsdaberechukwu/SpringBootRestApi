package com.example.springbootrestapi.Common.controller;

import com.example.springbootrestapi.Common.dto.Request.SignUpRequest;
import com.example.springbootrestapi.Common.dto.Response.SignUpResponse;
import com.example.springbootrestapi.domain.model.Student;
import com.example.springbootrestapi.domain.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hello")
public class HelloWordController {
    private final StudentService studentService;

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello world";
    }

   @PostMapping("register")
    public ResponseEntity<SignUpResponse> createdUser(@RequestBody SignUpRequest request){
        return studentService.register(request);
   }

}
