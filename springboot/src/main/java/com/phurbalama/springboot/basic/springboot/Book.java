package com.phurbalama.springboot.basic.springboot;

public class Book {
	long id; 
	String book;
	String author;
	public Book(long id, String book, String author) {
		super();
		this.id = id;
		this.book = book;
		this.author = author;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getId() {
		return id;
	}
	public String getBook() {
		return book;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", book=" + book + ", author=" + author + "]";
	}
	

}
