package com.cap.tr.ass.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int resrr[] = modifyArray(arr);
		for (int i : resrr) {
			System.out.println(i);
		}
	}

	private static int[] modifyArray(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		if(arr.length==0|| arr.length==1)
			return arr;



		int j=0;
		 for (int i=0; i < arr.length-1; i++) 
		        if (arr[i] != arr[i+1]) 
		            arr[j++] = arr[i];
		 arr[j++]=arr[arr.length-1];
		 int arr1[]=Arrays.copyOf(arr, j);
		return arr1;
	}

}
