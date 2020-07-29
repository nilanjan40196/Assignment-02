package com.capg.sortStr;

public class StringSort {
	public static String AlphabetSoup(String str) {
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			int min_index=i;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]<ch[min_index]) {
					min_index=j;
				}
			}
			char temp = ch[min_index];
			ch[min_index]=ch[i];
			ch[i]=temp;
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		System.out.println(AlphabetSoup("nilanjan"));

	}

}
