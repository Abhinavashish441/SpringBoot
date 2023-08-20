package com.abhinav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

