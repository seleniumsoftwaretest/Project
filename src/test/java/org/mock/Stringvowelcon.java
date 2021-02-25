package org.mock;

import java.util.Scanner;

public class Stringvowelcon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the txt: ");
		String value = s.nextLine();
		String lc = value.toLowerCase();
		int vc = 0;
		int cc = 0;
		for (int i = 0; i < lc.length(); i++) {
			char c = lc.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vc++;
			} else if (c >= 'a' && c <= 'z') {
				cc++;
			}

		}
		System.out.println("The number of vowels: " + vc);
		System.out.println("The number of consonants: " + cc);

	}

}
