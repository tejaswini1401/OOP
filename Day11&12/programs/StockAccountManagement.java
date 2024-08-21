/*
 1. Stock Account Management
a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
Print a Stock Report with the total value of each Stock and the total value of
Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.
e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
from the input file. Have functions in the Class to calculate the value of each
stock and the value of total stocks.
 */
package oop.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stock{
	
	String name;
	int noOfShares;
	double sharePrice;
	
	public Stock(String name, int noOfShares, double sharePrice) {
		this.name = name;
		this.noOfShares = noOfShares;
		this.sharePrice = sharePrice;
	}
	
	double getValue() {
		return noOfShares * sharePrice;
	}

	@Override
	public String toString() {
        return String.format("%-20s %-15d %-15.2f %-15.2f", name, noOfShares, sharePrice, getValue());

	}	
}

class StockPortfolio{
	
	List<Stock> stocks;
	
	StockPortfolio(){
		stocks = new ArrayList<>();
	}
	
	void addStocks(Stock stock) {
		stocks.add(stock);
	}
	
	double getTotalValue() {
		double total =0;
		for(Stock stock : stocks) {
			total += stock.getValue();
		}
		return total;
	}
	
	void printReport() {
		System.out.println("Stock report: ");
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Stock Name", "No. of Shares", "Share Price", "Total Value");
        for(Stock stock : stocks) {
        	System.out.println(stock);
		}
        System.out.printf("%nTotal Portfolio Value: $%.2f%n", getTotalValue());
	}
}

public class StockAccountManagement {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        StockPortfolio portfolio = new StockPortfolio();
        
        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < numStocks; i++) {
            System.out.print("Enter stock name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of shares for " + name + ": ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Enter share price for " + name + ": ");
            double sharePrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Stock stock = new Stock(name, numberOfShares, sharePrice);
            portfolio.addStocks(stock);
        }
        portfolio.printReport();
        scanner.close();

	}

}
