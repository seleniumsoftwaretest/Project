package org.mock;

import java.util.Scanner;

public class Stringupperlower1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the txt: ");
		String value = s.nextLine();
		String specch = "~!@#$%^&*()_+= {}[]|:;'<,>.?/*-";
		int lc = 0;
		int pc = 0;
		int ss = 0;
		int nc = 0;
		int sp = 0;
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);

			String string = Character.toString(c);

			if (c == ' ') {
				sp++;
			} else if (c >= 'a' && c <= 'z') {
				lc++;
			} else if (c >= 'A' && c <= 'Z') {
				pc++;
			} else if (specch.contains(string)) {
				ss++;
			} else if (c >= 0 && c <= 99999) {
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
