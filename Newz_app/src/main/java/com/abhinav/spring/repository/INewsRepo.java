package com.abhinav.spring.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.abhinav.spring.model.News;


public interface INewsRepo extends MongoRepository<News,Long>{

}
