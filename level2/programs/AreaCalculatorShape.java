/*
 7. Java Program to Find Area of Square, Rectangle and Circle using Method Overloading
Explanation
This is a Java Program to Find Area of Square, Rectangle and Circle using Method Overloading.
We declare three methods of the same name but with different numbers of arguments 
or with different data types. Now when we call these methods using objects, 
corresponding methods will be called as per the number of arguments or their data types.
 */
package level2.programs;
import java.util.Scanner;

public class AreaCalculatorShape {
	
	public static double area(double side) {
		return side * side;
	}
	public static double area(double length, double width) {
		return length * width;
	}
	public static double area(double radius, boolean isCircle) {
		
		if(isCircle) {
			return Math.PI * Math.pow(radius, 2);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Choose one shape in the following for calculating area ");
		System.out.println("Square, Rectangle, Circle");
		
		System.out.print("Enter shape : ");
		String shape = sc.nextLine();
		
		switch(shape){
			case "Square":
				System.out.print("Enter side : ");
				double side = sc.nextDouble();
				double squareArea = AreaCalculatorShape.area(side);
				System.out.println("Area of square "+squareArea);
				break;
				
			case "Rectangle":
				System.out.print("Enter length : ");
				double length = sc.nextDouble();
				
				System.out.print("Enter width : ");
				double width = sc.nextDouble();
				
				double rectangleArea = AreaCalculatorShape.area(length, width);
				System.out.println("Area of Rectangle "+rectangleArea);
				break;
				
			case "Circle":
				System.out.print("Enter radius : ");
				double radius = sc.nextDouble();
				double circleArea = AreaCalculatorShape.area(radius,true);
				System.out.println("Area of Circle "+circleArea);
				break;
				
			default:
				System.out.println("Invalid chsoice");
				
		}
	}

}
