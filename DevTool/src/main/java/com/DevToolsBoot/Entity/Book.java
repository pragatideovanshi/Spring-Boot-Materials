package com.DevToolsBoot.Entity;

public class Book {
	
	private int Id;
	private String Author;
	private String title;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Book(int id, String author, String title) {
		super();
		Id = id;
		Author = author;
		this.title = title;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
