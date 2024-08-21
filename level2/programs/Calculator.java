/*
 Java Program to create a calculator and Return a Value from a Method.
   Explanation:
   We make a method named input which is used to get input from the user. 
   We also make a method named add which is used to perform addition and return 
   the result back to the input method where we finally print the result.
 */
package level2.programs;
import java.util.Scanner;

public class Calculator {
	
	
	private int add(int num1, int num2) {
		
		return num1+num2;		
	}
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator obj = new Calculator();
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Hello"+name);
		System.out.println("Enter two numbers for addition ");
		System.out.print("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition is "+obj.add(num1,num2));
		
		sc.close();
		
	}
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.input();
		
	}
}
