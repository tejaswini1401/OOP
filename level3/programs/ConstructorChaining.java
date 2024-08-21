/*
 8. Java Program to use of Constructor Chaining:(Read about this first)
Explanation
A class named ConstructorChaining is defined with three constructors.
2. The first constructor is the default constructor, which calls the second constructor with the argument value of 
20 using this(20).
3. The second constructor is a parameterized constructor that takes one integer argument. It prints the value of x and 
is called from the default constructor using this(20).
4. The third constructor is also a parameterized constructor that takes two integer arguments. It calls the default 
constructor using this() and prints the value of x and y as well as their sum.
5. The main method calls the third constructor with arguments 11 and 12, which in turn calls the default constructor 
and prints the desired output.
 */

package level3.programs;

public class ConstructorChaining {
	
	public ConstructorChaining() {
		this(20);
		System.out.println("Default Constructor");
	}
	public ConstructorChaining(int x) {
		this(x, x+10);
		System.out.println("Parameterized constructor with one argument, x = "+x);
	}
	public ConstructorChaining(int x, int y) {
		System.out.println("Parameterized constructor with two argument, x = "+x+" y = "+y);
		System.out.println("sum = "+ x+y);
	}

	public static void main(String[] args) {
		
		ConstructorChaining obj = new ConstructorChaining(11,12);
	}

}
