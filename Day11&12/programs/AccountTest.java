/*
 2. Modify class Account to provide a method called debit that withdraws money
from an Account. Ensure that the debit amount does not exceed the Account’s
balance. If it does, the balance should be left unchanged and the method
should print a message indicating ―Debit amount exceeded account balance.
Modify class AccountTest to test method debit.
 */
package oop.programs;

import java.util.Scanner;

class Account{
	
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	double getBalance() {
		return balance;
	}
	
	void credit(double amount) {
		balance += amount;
	}
	
	void debit(double amount) {
		
		if(amount<=0) {
			System.out.println("Enter positive amount");
		}else if(amount > balance) {
			System.out.println("Insufficient balance");
		}else {
			balance -= amount;
		}
	}
}

public class AccountTest {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 Account account = null;
	     boolean exit = false;
	        
		 while (!exit) {
			 System.out.println("\n--- Account Menu ---");
	         System.out.println("1. Create Account");
	         System.out.println("2. Credit");
	         System.out.println("3. Debit");
	         System.out.println("4. Check Balance");
	         System.out.println("5. Exit");
	         System.out.print("Enter your choice: ");
	            
	         int choice = scanner.nextInt();
	            
	            switch(choice) {
	            
	            	case 1:
	            		// Create Account
	                    System.out.print("Enter initial balance: Rs.");
	                    double initialBalance = scanner.nextDouble();
	                    account = new Account(initialBalance);
	                    System.out.println("Account created with balance: Rs." + account.getBalance());
	                    break;
	                
	                    
	            	case 2:
	            		// Credit
	                    if (account == null) {
	                        System.out.println("No account found. Create account first");
	                        break;
	                    }
	                    System.out.print("Enter credit amount: Rs.");
	                    double creditAmount = scanner.nextDouble();
	                    account.credit(creditAmount);
	                    System.out.println("Balance after crediting Rs." + creditAmount + " : Rs." + account.getBalance());
	                    break;
	                 
	            	case 3:
	                    // Debit
	                    if (account == null) {
	                        System.out.println("No account found. Create an account first");
	                        break;
	                    }
	                    System.out.print("Enter debit amount: Rs.");
	                    double debitAmount = scanner.nextDouble();
	                    account.debit(debitAmount);
	                    System.out.println("Balance after attempting to debit Rs." + debitAmount);
	                    break;
	                    
	            	case 4:
	                    // Check Balance
	                    if (account == null) {
	                        System.out.println("No account found. Create an account first");
	                        break;
	                    }
	                    System.out.println("Current balance: Rs." + account.getBalance());
	                    break;
	            	
	            	case 5:
	                    // Exit
	                    exit = true;
	                    break;
	                
	                default:
	                    System.out.println("Invalid choice");
	                    break;
	            }
		 }
		 scanner.close();
	}

}
