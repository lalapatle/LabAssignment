package com.capgemini.tr.ass.lab4.ass3;

public class JournalPaper extends WrittenItem{
	
	private Integer yearPublished;
	public JournalPaper(String string, int i, String string2, int j) {
		// TODO Auto-generated constructor stub
		super(string,i,string2);
		this.yearPublished=j;
	}
	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getAuthor()=" + getAuthor() + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode() + ", getUin()=" + getUin() + ", getTitle()="
				+ getTitle() + ", getNoc()=" + getNoc() + ", getClass()=" + getClass() + "]";
	}

	
	

}
