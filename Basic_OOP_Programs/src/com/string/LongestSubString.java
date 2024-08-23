package com.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	private static int findMaxLenSubstr(String str) {
		
		Set<Character> set = new HashSet<>();
		int maxLen = 0;
		int left = 0;
		
		for(int i=0;i<str.length();i++) {
			while(set.contains(str.charAt(i))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(i));
			maxLen = Math.max(maxLen, i-left+1);
		}
		return maxLen;
		
	}
	public static void main(String[] args) {
		
		String str = "abcabcbb";
		int result = LongestSubString.findMaxLenSubstr(str);
		
		System.out.println(result);
	}

}
