/*
 3. Commercial data processing - StockAccount.java implements a data type that
might be used by a financial institution to keep track of customer information. The
StockAccount class implements following methods

The StockAccount class also maintains a list of CompanyShares objects
which have Stock Symbol and Number of Shares as well as DateTime of the
transaction. When buy or sell is initiated StockAccount checks if
CompanyShares are available and accordingly update or create an Object.
 */
package oop.programs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CompanyShares{
	
	String stockSymbol;
	int noOfShares;
	Date dateTime;
	public CompanyShares(String stockSymbol, int noOfShares, Date dateTime) {
		this.stockSymbol = stockSymbol;
		this.noOfShares = noOfShares;
		this.dateTime = new Date();
	}
}
public class StockAccount {
	
	private List<CompanyShares> cmpShareList;
	
	public StockAccount() {
		cmpShareList = new ArrayList<>();
	}
	
	double getShareValue(String symbol) {
		return 100;
	}
	
	double valueOf() {
		double totalValue =0.0;
		
		for(CompanyShares share:cmpShareList) {
			totalValue += share.noOfShares * getShareValue(share.stockSymbol);
		}
		return totalValue;
	}
	
	void buy(int amount, String symbol) {
		
		CompanyShares share = findCompanyShare(symbol);
		
		if(share!=null) {
			share.noOfShares += amount;
		}else {
			cmpShareList.add(new CompanyShares(symbol,amount, new Date()));
		}
		
	}
	
	void sell(int amount, String symbol) {
		
		CompanyShares share = findCompanyShare(symbol);
		
		if(share!=null && share.noOfShares >=amount) {
			share.noOfShares -= amount;
		}else {
			System.out.println("Insufficent sell");
		}
	}
	
	CompanyShares findCompanyShare(String symbol) {
		
		for(CompanyShares share :cmpShareList) {
			if(share.stockSymbol.equals(symbol)) {
				return share;
			}
		}
		return null;
	}
	
	void save(String filename) {
        System.out.println("Account saved to " + filename);
    }

	
	void printReport() {
		
		System.out.println("Stock Report: ");

		for(CompanyShares share:cmpShareList) {
			System.out.println("Share SYmbol : "+share.stockSymbol);
			System.out.println("No. of shares : "+share.noOfShares);
			System.out.println("DateTime : "+share.dateTime);

		}
	}

	public static void main(String[] args) {
		
		StockAccount account = new StockAccount();
		
		account.buy(100, "TATA");
		account.sell(10, "TATA");
		account.buy(200, "SBI");
		
		account.printReport();
		System.out.println("Total Value:  "+account.valueOf());
		account.save("bank.txt");

	}

}
