/*
 6. Java Program to Create a Method without Parameters and with Return Type
Explanation:
We have made a method to calculate the volume of a cuboid which takes the dimensions 
length, breadth and height as input and returns the volume as output back to the main method.
 */
package level3.programs;

class Cuboid{
	double length;
	double width;
	double height;
	
	public Cuboid(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	double calculateVolume() {
		return length * width * height;
	}
	
}
public class CuboidTest {

	public static void main(String[] args) {
		
		Cuboid obj = new Cuboid(3, 4, 5);
		double volume = obj.calculateVolume();
		System.out.println("Volume of cuboid is "+volume);
	}

}
