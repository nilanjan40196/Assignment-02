package com.capg.longestword;


public class LongestWord {
	public String longestWord(String str) {
		String[] sArr = str.split(" ");
		
		String max="";
		int max_len=sArr[0].length();
		max=sArr[0];
		for(int i=0;i<(sArr.length)-1;i++) {
			
			if(max_len<sArr[i+1].length()) {
				max_len=sArr[i+1].length();
				max=sArr[i+1];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(new LongestWord().longestWord("bbb ccc jjj iii aaaa nilanjan"));
	}
}
