package com.cap.ass.lab9;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username and password: ");
        String username=sc.nextLine();
        String password=sc.nextLine();
        BiFunction<String , String, Boolean> res=(user,pass)->{
        	if(user.equals("admin")  && pass.equals("adminadmin"))
        		return true;
        	return false;
        };
        if(res.apply(username, password).equals(true))
        	System.out.println("Valid credentials");
        else  
        	System.out.println("Invalid Credentials");
        		
	}

}
