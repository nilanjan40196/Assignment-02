package com.capg.capitalize;

public class CapitalWord {
	public static void LetterCapitalize(String str){
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++) {
			String s = words[i];
			char c = (char) (s.charAt(0)-32);
			s=s.replace(s.charAt(0), c);
			
			System.out.print(s+" ");
		}
		
	}

	public static void main(String[] args) {
		LetterCapitalize("hello my name is dip");
	}

}
