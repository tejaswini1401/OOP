/*
 7. Java Program to Create a Method with 2 Parameters and without Return Type
Explanation:
Enter the length and breadth of the rectangle as input. Now we pass these values as parameters to the new method 
where we calculate the area and print the output.
 */
package level3.programs;
import java.util.Scanner;

public class RectangleArea {
	
	public static void areaRectangle(double length, double width) {
		
		double area = length*width;
		
		System.out.println("Area of rectangle is "+area);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of rectangle: ");
		double length = sc.nextDouble();
		
		System.out.print("Enter width of rectangle: ");
		double width = sc.nextDouble();
		
		RectangleArea.areaRectangle(length, width);
		
		sc.close();
	}

}
