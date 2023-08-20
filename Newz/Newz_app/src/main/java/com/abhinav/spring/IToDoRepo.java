package com.abhinav.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.abhinav.spring.model.ToDo;


@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
