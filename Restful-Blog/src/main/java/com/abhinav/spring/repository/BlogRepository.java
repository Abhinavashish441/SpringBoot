package com.abhinav.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.spring.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
