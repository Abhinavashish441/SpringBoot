package com.abhinav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

