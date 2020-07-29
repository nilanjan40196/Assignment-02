package com.capg.primefactor;

import java.util.Scanner;

public class PrimeFactor {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				System.out.print(i+" ");
				num/=i;
			}
		}
		

	}

}
