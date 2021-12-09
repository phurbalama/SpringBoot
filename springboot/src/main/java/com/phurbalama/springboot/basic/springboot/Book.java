package com.phurbalama.springboot.basic.springboot;

public class Book {
	long id; 
	String book;
	String author;
	int copies;
	

	public Book(long id, String book, String author, int copies) {
		super();
		this.id = id;
		this.book = book;
		this.author = author;
		this.copies = copies;
	}

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
	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", book=" + book + ", author=" + author + ", copies=" + copies + "]";
	}
	
	
	

}
