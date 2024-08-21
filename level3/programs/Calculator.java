/*
 1. Java Program to create a calculator and apply all  features of Abstract class
Explanation:
Need  to create made add(),multiply(), divide(), Subtract()  as abstract methods in parent 
class which are defined in child class and we can call all these methods via making object 
of child class.as abstract methods in parent class which are defined in child class and 
we can call all these methods via making object of child class.
 */

package level3.programs;

abstract class CalculateTest {

	abstract void add(double num1, double num2);
	abstract void subtract(double num1, double num2);
	abstract void multiply(double num1, double num2);
	abstract void divide(double num1, double num2);
}

class SimpleCalculator extends CalculateTest{
	
	@Override
	void add(double num1, double num2) {
		System.out.println("Addition : "+(num1+num2));
	}
	
	@Override
	void subtract(double num1, double num2) {
		System.out.println("Subtraction : "+(num1-num2));
	}
	
	@Override
	void multiply(double num1, double num2) {
		System.out.println("Subtraction : "+(num1*num2));
	}
	
	@Override
	void divide(double num1, double num2) {
		System.out.println("Divide : "+(num1/num2));
	}	
}
class Calculator{
	
	public static void main(String[] args) {
		
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(10, 5);
		calc.subtract(10, 5);
		calc.multiply(10, 5);
		calc.divide(10, 5);
	}
}
