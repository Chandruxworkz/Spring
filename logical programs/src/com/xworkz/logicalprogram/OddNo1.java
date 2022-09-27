package com.xworkz.logicalprogram;

import java.util.Scanner;

public class OddNo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
			int n = sc.nextInt();
	
		
		for(int i=1;i<=n;i=i+2) {
			System.out.println("i "+i);
		}
	}

}
