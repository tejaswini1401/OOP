package com.string;

public class ReverseString {
	
	private static String reverse(String str) {
		
		/* 1st approach : 
		 StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		return sb.toString();	*/
		
		/* 2nd approach : 
		char ch[] = str.toCharArray();
		
		String rev = "";
		
		for(int i=ch.length-1;i>=0;i--) {
			rev = rev+ch[i];
		}
		return rev;*/
		
		char[] ch = str.toCharArray();
		
		int left =0;
		int right = ch.length-1;
		
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		
		String str = "Teja";
		
		String result = ReverseString.reverse(str);
		System.out.println(result);
		
	}

}
