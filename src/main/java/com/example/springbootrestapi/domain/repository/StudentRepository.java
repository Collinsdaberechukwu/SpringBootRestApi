package com.example.springbootrestapi.domain.repository;

import com.example.springbootrestapi.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student,Long> {
    boolean existsByEmailOrFirstname(String email, String firstname);

}
