package com.abhinav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
