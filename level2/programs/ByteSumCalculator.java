/*
 5. Java Program to Calculate Sum of Two Byte Values using Type Casting
   Explanation: This is a Java Program to Calculate Sum of Two Byte Values Using Type Casting. 
   Type casting in Java is to cast one type, a class or interface, into another type
   i.e. another class or interface.
    Enter any two byte values as input. 
    After that we first convert these two bytes into integers using type casting 
    and then we add those values and get the desired output.
 */
package level2.programs;
import java.util.Scanner;

public class ByteSumCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first byte value : ");
		byte byte1 = sc.nextByte();
		
		System.out.print("Enter 2nd byte value : ");
		byte byte2 = sc.nextByte();
		
		int int1 = (int) byte1;
		int int2 = (int) byte2;
		
		int sum = int1 + int2;
		
		System.out.print("Sum : "+sum);
		
		
	}

}
