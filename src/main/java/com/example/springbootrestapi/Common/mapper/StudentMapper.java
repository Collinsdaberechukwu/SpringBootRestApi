package com.example.springbootrestapi.Common.mapper;

import com.example.springbootrestapi.Common.dto.Request.SignUpRequest;
import com.example.springbootrestapi.Common.dto.Response.SignUpResponse;
import com.example.springbootrestapi.domain.model.Student;

public class StudentMapper {
    public static Student mapSignUpRequestToStudent(SignUpRequest request){
        return Student.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .build();
    }

    public static Student mapSignUpResponseToStudent(SignUpResponse response){
        return Student.builder()
                .firstname(response.getFirstname())
                .email(response.getEmail())
                .build();
    }
}
