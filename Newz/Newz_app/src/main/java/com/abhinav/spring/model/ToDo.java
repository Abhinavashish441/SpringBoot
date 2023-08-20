package com.abhinav.spring.model;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table (name="news")
public class ToDo {
	
	@Id
	@Nonnull
	private Long id;
	
	@Column
	@Nonnull
	private String title;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	@Nonnull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	@PrePersist
	private void onCreate() {
		date = new Date();
	}
	
	@Column
	@Nonnull
	private String author;
	
	@Column
	@Nonnull
	private String description;
	
	@Column
	@Nonnull
	private String content;
	
	public ToDo() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

}
