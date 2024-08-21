package level2.programs;
import java.util.Scanner;

public class CuboidCalculator {
	
	public static double perimeter(double length, double breadth, double height) {
		
		return 4 * (length + breadth + height);
	}
	
	public static double area(double length, double breadth, double height) {
		
		double perimeter = CuboidCalculator.perimeter(length, breadth, height);
		System.out.println("Perimeter of Cuboid is "+perimeter);

		return 2 *(length * breadth + breadth*height + length * height);
		
	}
	
	public static double volume(double length, double breadth, double height) {
		
		double area = CuboidCalculator.area(length, breadth, height);
		System.out.println("Area of Cuboid is "+area);
		
		return area * height;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of cuboid : ");
		double length = sc.nextDouble();
		
		System.out.print("Enter breadth of cuboid : ");
		double breadth = sc.nextDouble();
		
		System.out.print("Enter height of cuboid : ");
		double height = sc.nextDouble();
		
		double cuboidVolume = CuboidCalculator.volume(length, breadth, height);
		
		System.out.println("Volume of Cuboid is "+cuboidVolume);
		
		sc.close();		
	}

}
