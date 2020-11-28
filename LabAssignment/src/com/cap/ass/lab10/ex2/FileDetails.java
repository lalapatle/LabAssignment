package com.cap.ass.lab10.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDetails {
	  public static void main(String rr[])throws IOException
      {
             FileDemo fd=new FileDemo();
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the file name:");
             String s=br.readLine();
             fd.analyze(s);
      }

}
