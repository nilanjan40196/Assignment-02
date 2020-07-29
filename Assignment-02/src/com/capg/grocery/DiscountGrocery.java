package com.capg.grocery;

import java.util.Scanner;

public class DiscountGrocery {
	public double calculateDiscount(int choice,double grocProdsAmount,double nonGrocProdsAmount ) {
		double finalAmount=0.0;int amt = 0;
		switch(choice) {
		case 1 : 
			nonGrocProdsAmount-=(nonGrocProdsAmount*0.3);
			finalAmount = nonGrocProdsAmount + grocProdsAmount;
			 amt = (int) (finalAmount/100);
			amt*=5;
			finalAmount-=amt;
			break;
		case 2 : 
			nonGrocProdsAmount -= (nonGrocProdsAmount*0.1);
			finalAmount = nonGrocProdsAmount + grocProdsAmount;
			amt = (int) (finalAmount/100);
			amt*=5;
			finalAmount-=amt;
			break;
		case 3 : 
			nonGrocProdsAmount -= (nonGrocProdsAmount*0.05);
			finalAmount = nonGrocProdsAmount + grocProdsAmount;
			amt = (int) (finalAmount/100);
			amt*=5;
			finalAmount-=amt;
			break;
		default :
			System.out.println("Invalid choice");
			break;
		}
		return finalAmount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id : ");
		long custId = sc.nextLong();
		System.out.println("Select type of Customer\n 1.Employee of the store\n 2.Affiliate of the store\n 3.Customer for 2 or more years ");
		int choice = sc.nextInt();
		System.out.println("Enter amount of grocery products : ");
		double grocProdsAmount = sc.nextDouble();
		System.out.println("Enter amount of non grocery products : ");
		double nonGrocProdsAmount = sc.nextDouble();
		sc.close();
		double finalAmount = new DiscountGrocery().calculateDiscount(choice, grocProdsAmount, nonGrocProdsAmount);
		System.out.println("Customer of id"+ custId+" total amount after discount is : "+finalAmount);

	}

}
