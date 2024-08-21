/*
 6. Java Program to Find Arithmetic Sum by Passing Argument Using Method Overloading
   Explanation:
This is a Java Program to Find Arithmetic Sum of 2 or 3 or 4 Variables by Passing Arguments 
using Method Overloading. Two or more methods within the same class that share the 
same name but with different parameter declarations are called overloaded methods, 
and the process is referred to as method overloading.
Here we define a class with three different methods with the same name but different number
of parameters. Now these methods can be called depending upon the number of arguments passed. 
Hence we get three different values as output.
 */
package level2.programs;
import java.util.Scanner;

public class ArithmeticSum {
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public static int sum(int num1, int num2,int num3) {
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter num3 : ");
		int num3 = sc.nextInt();
		
		System.out.println("Addition of num1 and num2 is "+sum(num1, num2));
		System.out.println("Addition of num1 and num2 is "+sum(num1, num2,num3));
		
	}

}
