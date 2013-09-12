package com.prosper.dispatcher.service.bean;

public class Article {

	private long id;
	
	private String title;
	
	private String content;
	
	private long userId;
	
	public Article(String title, String content) {
		this(-1, title, content);
	}
	
	public Article(long id, String title, String content) {
		setId(id);
		setTitle(title);
		setContent(content);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
