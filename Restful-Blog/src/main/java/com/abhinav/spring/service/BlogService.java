package com.abhinav.spring.service;



import java.util.List;

import com.abhinav.spring.model.Blog;

public interface BlogService {
    Blog saveBlog(Blog blog);

    List<Blog> getAllBlogs();

    Blog getBlogById(int id);

    Blog updateBlog(int id, Blog blog);

    void deleteBlog(int id);
}
