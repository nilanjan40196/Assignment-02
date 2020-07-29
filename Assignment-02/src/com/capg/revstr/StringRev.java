package com.capg.revstr;

public class StringRev {
	public static String ReverseOrder(String str) {
		String s = "";
		for(int i=str.length()-1;i>=0;i--) {
			s+=str.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(ReverseOrder("hello my name is nilanjan saha"));

	}

}
