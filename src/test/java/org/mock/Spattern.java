package org.mock;

import java.util.Scanner;

public class Spattern {

	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = s.nextInt();
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
