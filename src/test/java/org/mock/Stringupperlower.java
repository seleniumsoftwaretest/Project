package org.mock;

import java.util.Scanner;

public class Stringupperlower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the txt: ");
		String value = s.nextLine();

		int lc = 0;
		int pc = 0;
		int ss = 0;
		int nc = 0;
		int sp = 0;
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			int a = (int) c;

			if (a == 32) {
				sp++;
			} else if (a >= 97 && a <= 122) {
				lc++;
			} else if (a >= 65 && a <= 90) {
				pc++;
			} else if (a >= 32 && a <= 47 || a >= 58 && a <= 64 || a >= 91 && a <= 96 || a >= 123 && a <= 126) {
				ss++;
			} else if (a >= 48 && a <= 59) {
				nc++;
			}

		}
		System.out.println("The number of lowercase: " + lc);
		System.out.println("The number of uppercase: " + pc);
		System.out.println("The number of special character: " + ss);
		System.out.println("The number of digits: " + nc);
		System.out.println("The number of space:" + sp);

	}

}
