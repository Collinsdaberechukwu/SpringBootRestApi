package com.example.springbootrestapi.domain.repository;

import com.example.springbootrestapi.domain.model.HelloWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWordRepo extends JpaRepository<HelloWord,Long> {
}
