package com.xworkz.logicalprogram;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int j=0;
		int c=0;
		System.out.println("Enter a number");
		int t =sc.nextInt();
		for(int i=0;i<t;i++) {
		int n = sc.nextInt();
		int count=0;
	     for(int div=1;div<=n;j++)
		{
			if(n%div==0) {
				c++;
		
		if(c==2) {
			System.out.println("Prime Number");
	}
			}else {
			System.out.println("Not a prime number");
		}

}
}
	}}

