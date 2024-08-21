/*
4. Java Program to Implement Shape Interface using Circle and Rectangle Class
Explanation:
Interfaces are syntactically similar to classes, but they lack instance variables, 
and their methods are declared without any body. Here we make the interface as Shape 
with two methods as input() and area() which are implemented by further two classes 
as circle and rectangle who implements the interface Shape.
*/

package level3.programs;
import java.util.Scanner;
interface Shape{
	void input();
	double area();
}
class Circle implements Shape{
	double radius;
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius of Circle: ");
		radius = sc.nextDouble();
		
		
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}

class Rectangle implements Shape{
	
	double length;
	double width;
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of rectangle : ");
		length = sc.nextDouble();
		
		System.out.print("Enter width of rectangle : ");
		width = sc.nextDouble();
		
		sc.close();
	}
	
	@Override
	public double area() {
		
		return length*width;
	}
	
}
public class ShapeTest {

	public static void main(String[] args) {
		
		Shape circle =  new Circle();
		circle.input();
		System.out.println("Area of circle is "+circle.area());
		
		Shape rectangle = new Rectangle();
		rectangle.input();
		System.out.println("Area of rectangle is "+rectangle.area());
		
	}

}
