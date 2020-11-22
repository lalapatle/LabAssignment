package com.cap.tr.ass.lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Ass9 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" date in format dd-MMMM-yyyy");
		String dt = sc.next();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMM-yyyy");
		Date mydate = sdf1.parse(dt);
		LocalDate gdd = mydate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate gd = LocalDate.now();
		Period diff = Period.between(gdd, gd);
		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}

}
