package com.capgemini.tr.ass.lab4.ass3;

public class CD extends MediaItem{
	
	private String artist;
	private String genre;
	public CD(String title, int noc, int runtime,String artist,String genre) {
		super(title, noc, runtime);
		// TODO Auto-generated constructor stub
		this.artist=artist;
		this.genre=genre;
	}
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", Runtime=" + getRuntime() + ", UIN=" + getUin() + ", Title="
				+ getTitle() + ", getNoc()=" + getNoc() + ", getClass()=" + getClass() + "]";
	}
	

}
