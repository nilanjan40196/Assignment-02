package com.capg.factorial;

import java.util.Scanner;

public class Fact {
	public long factorial(int num) {
		if(num==0)
			return 1;
		if(num==1)
			return 1;
		else
			return num*factorial(num-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(new Fact().factorial(sc.nextInt()));
		sc.close();
	}
}
