package com.practicePrograms;

import java.util.Scanner;

public class HCFAndLCMCalculator {
	
	public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return Math.abs(a * b) / findHCF(a, b);
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);

        scanner.close();

	}

}
