package org.mock;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = s.nextInt();
		if(a%2!=0) {
			System.out.println("Prime number");
		}else
		System.out.println("Not prime number");

	}

}
