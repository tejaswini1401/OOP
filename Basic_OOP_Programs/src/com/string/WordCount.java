package com.string;

public class WordCount {
	
	private static int count(String str) {
		int count =0;
		for(char ch : str.toCharArray()) {
			if(str.isEmpty()) {
				break;
			}else {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		String str = "Teja";
		
		int result = WordCount.count(str);
		System.out.println(result);
	}

}
