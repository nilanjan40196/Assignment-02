package com.capg.anagram;

import java.util.Arrays;

public class AnagramExample {
	public static boolean anag(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] str1=s1.toCharArray(),str2=s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		//System.out.println(String.valueOf(str1)+" "+String.valueOf(str2));
		
		for(int i=0;i<str1.length;i++) {
			if(str1[i]!=str2[i])
				return false;
		
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(anag("Save","Vase")) {
			System.out.println("The two strings are anagram.");
		}else
			System.out.println("The two strings are not anagram.");
	}

}
