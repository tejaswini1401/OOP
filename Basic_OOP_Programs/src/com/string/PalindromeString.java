package com.string;

public class PalindromeString {
	
	private static boolean isPalindrome(String str) {
		
		/*String revStr = new StringBuilder(str).reverse().toString();
		
		return str.equals(revStr); */
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "aba";
		
		boolean result = PalindromeString.isPalindrome(str);
		
		if(result) {
			System.out.println("String is palindrome string");
		}else {
			System.out.println("String is not palindrome string");
		}

	}

}

