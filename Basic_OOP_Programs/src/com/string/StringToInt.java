package com.string;

public class StringToInt {
	
	public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0, n = s.length();
        int sign = 1;
        int result = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            if (result > (Integer.MAX_VALUE - (c - '0')) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + (c - '0');
            i++;
        }

        return result * sign;
    }

	public static void main(String[] args) {
		System.out.println(myAtoi("42"));               
        
	}

}
