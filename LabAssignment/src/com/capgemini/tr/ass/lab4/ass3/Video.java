package com.capgemini.tr.ass.lab4.ass3;

public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private Integer yearReleased;
	public Video(String title, int noc, int runtime, String director, String genre, int yearReleased) {
		// TODO Auto-generated constructor stub
		super(title,noc,runtime);
		this.director=director;
		this.genre=genre;
		this.yearReleased=yearReleased;
	}
	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode() + ", getUin()=" + getUin() + ", getTitle()="
				+ getTitle() + ", getNoc()=" + getNoc() + ", getClass()=" + getClass() + "]";
	}
	

}
