package com.example.springbootrestapi.domain.repository;

import com.example.springbootrestapi.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    boolean existsByEmailOrFirstname(String email, String firstname);

}
