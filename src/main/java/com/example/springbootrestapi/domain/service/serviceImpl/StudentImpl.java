package com.example.springbootrestapi.domain.service.serviceImpl;

import com.example.springbootrestapi.Common.dto.Request.SignUpRequest;
import com.example.springbootrestapi.Common.dto.Response.SignUpResponse;
import com.example.springbootrestapi.Common.mapper.StudentMapper;
import com.example.springbootrestapi.domain.repository.StudentRepository;
import com.example.springbootrestapi.domain.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class StudentImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public ResponseEntity<SignUpResponse> register(SignUpRequest request) {
        if (studentRepository.existsByEmailOrFirstname(request.getEmail(), request.getFirstname())) {
            throw new RuntimeException("User already existed");
        }
         studentRepository.save(StudentMapper.mapSignUpRequestToStudent(request));

        SignUpResponse response= new SignUpResponse();
        log.info("Student {} Details saved successfully",request);
        return ResponseEntity.ok(response);

    }


}
