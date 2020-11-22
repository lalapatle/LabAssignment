package com.capgemini.tr.ass.lab4.ass3;

public class Book extends WrittenItem{

	public Book( String string, int j, String string2) {
		// TODO Auto-generated constructor stub
		super(string,j,string2);
		
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getUin()=" + getUin() + ", getTitle()=" + getTitle() + ", getNoc()=" + getNoc() + ", getClass()="
				+ getClass() + "]";
	}
	

}
