/*
 3. Java Program to Create a class Bank Account and the Inner Class Interest in it
Explanation
We declare the Outer class as BankAcct and the inner class as Interest. 
Now we use the variables declared in the outer class to get the output in the inner class.
 */
package level3.programs;

public class BankAccount {
	
	double balance;
	
	BankAccount(double balance){
		this.balance = balance;
	}
	
	public double getBalance(double balance) {
		return balance;
	}
	
	class Interest{
		
		double rate;
		
		Interest(double rate){
			this.rate = rate;
		}
		double interest = (rate * balance)/100;
		
		void displayInterest() {
			System.out.println("Interest : "+interest);
		}
	}

	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount(50000);
		BankAccount.Interest interestObj = obj.new Interest(5.0);
		interestObj.displayInterest();
	}

}
