package com.xworkz.logicalprogram;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is even number");
		}
		else {
			System.out.println(num+" is not a even number");
		}
	}

}
}
