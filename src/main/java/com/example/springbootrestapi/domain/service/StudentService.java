package com.example.springbootrestapi.domain.service;

import com.example.springbootrestapi.Common.dto.Request.SignUpRequest;
import com.example.springbootrestapi.Common.dto.Response.SignUpResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    ResponseEntity<SignUpResponse> register(SignUpRequest request);
}
