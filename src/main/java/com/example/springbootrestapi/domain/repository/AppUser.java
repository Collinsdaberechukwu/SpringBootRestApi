package com.example.springbootrestapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUser extends JpaRepository<AppUser,Integer> {
}
