package com.string;

import java.util.Arrays;

public class AnagramString {
	
	private static boolean isAnagram(String str1,  String str2) {
		
		char[] str1Chars = str1.toCharArray();
		char[] str2Chars = str2.toCharArray();
		
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);
		
		if(Arrays.equals(str1Chars, str2Chars)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";
		
		boolean result = AnagramString.isAnagram(str1, str2);
		
		if(result) {
			System.out.println("Given two Strings are anagram string");
		}else{
			System.out.println("Given two Strings are not anagram string");
		}
		
	}

}
