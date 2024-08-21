/*
 9. Java Program to use of String Constructor 
Explanation:
Constructor is used to initialize an object. Here you need to make two classes as Super and Sub class using Inheritance. 
We initialize two different strings in the constructors of these two classes and with the help of the object of Subclass 
we print these strings.Java Program to Allocate and Initialize Super Class Members using Constructor
 */
package level3.programs;

class SuperClass{
	
	String superString;
	
	SuperClass(String superString){
		this.superString=superString;
		System.out.println("Super class constructor called");
		System.out.println("Super class string : "+superString);
	}
}

class SubClass extends SuperClass{
	
	String subClassString;
	
	SubClass(String  superString,String subClassString){
		super(superString);
		this.subClassString=subClassString;
		System.out.println("Sub class constructor called");
		System.out.println("Sub class string : "+subClassString);
	}
}

public class StringConstrictor {

	public static void main(String[] args) {
		
		SubClass obj = new SubClass("superString", "SubString");

	}

}
