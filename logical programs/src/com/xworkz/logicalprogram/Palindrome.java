package com.xworkz.logicalprogram;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int num = sc.nextInt();
			// int n = 404,
			int r= 0;
			int s=0;
			int t = num;
			while (num > 0) {

				r = num % 10;
				num = num / 10;
				s = s * 10 + r;
			}
			if (t == s) {
				System.out.println("Number is palindrome");
			} else {
				System.out.println("Number is not a palindrome");
			}
		}

	}
}
