package org.mock;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = s.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		
	}

}
