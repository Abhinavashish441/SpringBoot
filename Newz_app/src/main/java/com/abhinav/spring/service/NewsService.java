package com.abhinav.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhinav.spring.model.News;
import com.abhinav.spring.repository.INewsRepo;



@Service
public class NewsService {
	
	@Autowired
	INewsRepo repo;

	public List<News> getAllNewsItems() {
		ArrayList<News> newsList = new ArrayList<>();
		repo.findAll().forEach(news -> newsList.add(news));
		
		return newsList;
	}
	
	public News getNewsItemById(Long id) {
		return repo.findById(id).get();
	}
	
	public boolean updateStatus(Long id) {
		News news = getNewsItemById(id);
		
		
		return saveOrUpdateNewsItem(news);
	}
	
	public boolean saveOrUpdateNewsItem(News news) {
		News updatedObj = repo.save(news);
		
		if (getNewsItemById(updatedObj.getId()) != null) {
			return true;
		}
		
		return false;
	}
	
	public boolean deleteNewsItem(Long id) {
		repo.deleteById(id);
		
		if (repo.findById(id).isEmpty()) {
			return true;
		}
		
		return false;
	}
	
}