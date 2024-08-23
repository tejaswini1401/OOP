package com.string;

public class StringCompression {
	
	private static String stringCom(String str) {
		int count =0;
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0;i<str.length()-1;i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				sb.append(str.charAt(i));
				sb.append(count);
				count =1;
			}
			
		}
		sb.append(str.charAt(str.length()-1));
		sb.append(count);
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String str = "aabbbcccc";
		
		String result  = StringCompression.stringCom(str);
		System.out.println(result);

	}

}
