package com.capgemini.tr.ass.lab4.ass3;

public class WrittenItem extends Items{
	private String author;
	
	public WrittenItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(String title, Integer noc,String author) {
		super(title, noc);
		// TODO Auto-generated constructor stub
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getUin()=" + getUin() + ", getTitle()=" + getTitle() + ", getNoc()=" + getNoc() + ", getClass()="
				+ getClass() + "]";
	}
	
}
