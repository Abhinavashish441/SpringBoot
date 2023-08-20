package com.abhinav.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.abhinav.spring.model.News;
import com.abhinav.spring.service.NewsService;



@Controller
public class NewsController {

	@Autowired
	private NewsService service;
	
	@GetMapping({"/","/addNews"})
	public String addNewsItem(Model model,@ModelAttribute("message") String message) {
		model.addAttribute("news", new News());
		model.addAttribute("list", service.getAllNewsItems());
		return "AddNews";
	}

	

	@GetMapping("/updateNewsStatus/{id}")
	public String updateNewsStatus(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		if (service.updateStatus(id)) {
			redirectAttributes.addFlashAttribute("message", "Update Success");
			return "redirect:/viewNewsList";
		}
		
		redirectAttributes.addFlashAttribute("message", "Update Failure");
		return "redirect:/viewNewsList";
	}

	

	@PostMapping("/saveNews")
	public String saveToDoItem(News news, RedirectAttributes redirectAttributes) {
		if(service.saveOrUpdateNewsItem(news)) {
			redirectAttributes.addFlashAttribute("message", "Save Success");
			return "redirect:/addNews";
		}
		
		redirectAttributes.addFlashAttribute("message", "Save Failure");
		return "redirect:/addNews";
	}
	
	@GetMapping("/editNewsItem/{id}")
	public String editNewsItem(@PathVariable Long id, Model model) {
		model.addAttribute("news", service.getNewsItemById(id));
		
		return "AddNews";
	}

	@PostMapping("/editSaveNewsItem")
	public String editSaveNewsItem(News news, RedirectAttributes redirectAttributes) {
		if(service.saveOrUpdateNewsItem(news)) {
			redirectAttributes.addFlashAttribute("message", "Edit Success");
			return "redirect:/viewNewsList";
		}
		
		redirectAttributes.addFlashAttribute("message", "Edit Failure");
		return "redirect:/editNewsItem/" + news.getId();
	}
	
	@GetMapping("/deleteNewsItem/{id}")
	public String deleteNewsItem(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		if (service.deleteNewsItem(id)) {
			redirectAttributes.addFlashAttribute("message", "Delete Success");
			return "redirect:/addNews";
		}
		
		redirectAttributes.addFlashAttribute("message", "Delete Failure");
		return "redirect:/addNews";
	}
	
}
