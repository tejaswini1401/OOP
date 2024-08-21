/*
 3. Java Program to create an Area of triangle and rectangle and 
 Passing and Returning Objects in Java
   Explanation:
Enter length and breadth of the rectangle as input. After that we create 
an object of that class and pass the reference variable to two different methods. 
Now we calculate the area for two different objects and return them to the main method.
Hence we get two different areas as output.
 */
package level2.programs;
import java.util.Scanner;

public class AreaCalculator {
	
	public static double areaOfRecatangle(double length, double width) {
		
		return length * width;
		
	}
	
	public static void inputRectangle(Scanner sc) {
		
		System.out.print("Enter length of Rectangle: ");
		double length = sc.nextInt();
		
		System.out.print("Enter Width of Rectangle: ");
		double width = sc.nextInt();
		
		double rectArea = AreaCalculator.areaOfRecatangle(length, width);
		System.out.println("Area of rectangle is  "+rectArea);
		
	}
	
	public static double areaOfTriangle(double base, double height) {
		
		return 0.5 * base * height;
	}
	
	public static void inputTriangle(Scanner sc ) {
		
		
		System.out.print("Enter base of triangle: ");
		double base = sc.nextInt();
		
		System.out.print("Enter height of triangle: ");
		double height = sc.nextInt();
		
		double triangleArea = AreaCalculator.areaOfTriangle(base, height);
		System.out.println("Area of rectangle is  "+triangleArea);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		inputRectangle(sc);
		inputTriangle(sc);
		
		sc.close();

	}

}
