/*
 5. Java Program to Swap Objects using Swap() Method

Explanation:
Make a swap method to interchange the information of two employees using 
Employee Objects by passing them to swap() method.
 */
package level3.programs;
class Employee{
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name : "+name+", id : "+id);
	}	
}

class SwapEmployee{
	public static void swap(Employee emp1, Employee emp2) {
		
		String emp1Name = emp1.getName();
		int emp1Id = emp1.getId();
		
		emp1.setName(emp2.getName());
		emp1.setId(emp2.getId());
		
		emp2.setId(emp1Id);
		emp2.setName(emp1Name);
	}
}
public class EmployeeSwapTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Teja");
		Employee emp2 = new Employee(2, "Shreya");
		
		System.out.println("Before swapping ");
		System.out.println("Employee 1: ");
		emp1.display();
		System.out.println("Employee 2: ");
		emp2.display();
		
		SwapEmployee.swap(emp1, emp2);
		
		System.out.println("After swapping ");
		System.out.println("Employee 1: ");
		emp1.display();
		System.out.println("Employee 2: ");
		emp2.display();
	}

}
