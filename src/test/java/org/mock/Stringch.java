package org.mock;

import java.util.Arrays;
import java.util.Scanner;

public class Stringch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the txt: ");
		String value = s.nextLine();
		char[] c = value.toCharArray();
		Arrays.sort(c);
		System.out.print("Sorted: ");
		System.out.println(c);
	}

}
