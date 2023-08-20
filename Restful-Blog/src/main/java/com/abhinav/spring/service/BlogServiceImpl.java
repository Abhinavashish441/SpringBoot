package com.abhinav.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhinav.spring.model.Blog;
import com.abhinav.spring.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(int id) {
        Optional<Blog> optionalBlog = blogRepository.findById(id);
        return optionalBlog.orElse(null);
    }

    @Override
    public Blog updateBlog(int id, Blog blog) {
        if (blogRepository.existsById(id)) {
            blog.setBlogId(id);
            return blogRepository.save(blog);
        }
        return null;
    }

    @Override
    public void deleteBlog(int id) {
        blogRepository.deleteById(id);
    }
}

