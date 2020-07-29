package com.capg.changeLetter;

public class ChangesLetter {
	public static String LetterChanges(String str) {
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' ||ch[i]=='u') {
				ch[i]=(char) (ch[i]-32);
			}else if(ch[i]=='z'){
				ch[i]='a';
			}else if(ch[i] == ' '){
				continue;
			}
			else {
				ch[i]+=1;
			}
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		System.out.println(LetterChanges("nilanjan saha"));
	}

}
