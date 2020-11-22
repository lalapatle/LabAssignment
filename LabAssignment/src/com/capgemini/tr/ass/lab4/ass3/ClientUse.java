package com.capgemini.tr.ass.lab4.ass3;

public class ClientUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book( "ABC", 12, "PQR");
		System.out.println(book.toString());
		book.checkIn();
		System.out.println(book.toString());
		
		
		JournalPaper jp = new JournalPaper( "JP", 44, "XYZ", 2001);
		System.out.println(jp.toString());
		jp.checkOut();
		System.out.println(jp.toString());
		
		Video video = new Video( "DJ", 2, 4, "Shukla", "Love", 1989);
		System.out.println(video.toString());
		video.checkIn();
		System.out.println(video.toString());
		
	
		CD cd = new CD( "JK", 1, 9, "ABC", "Comedy");
		System.out.println(cd.toString());
		cd.checkOut();
		System.out.println(cd.toString());
		
	

	}

}
