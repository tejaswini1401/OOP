/*
 2. Java Program to Count Number of Objects Created for Class
   Explanation:Whenever an object is made of a class, its constructor is invoked. 
   Whenever the constructor runs we increment the counter value. 
   Hence the number of objects created of a class equals the counter value.
   
 */
package level2.programs;

public class CountNumObj {
	
	static int count;
	
	CountNumObj(){
		count++;
	}

	public static void main(String[] args) {
		CountNumObj obj1 = new CountNumObj();
		CountNumObj obj2 = new CountNumObj();
		CountNumObj obj3 = new CountNumObj();
		CountNumObj obj4 = new CountNumObj();
		CountNumObj obj5 = new CountNumObj();
		
		System.out.println("Number of objects cretaed : "+count);
	}

}
