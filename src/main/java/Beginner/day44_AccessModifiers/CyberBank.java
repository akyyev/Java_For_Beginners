package Beginner.day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
	
	public static void main(String[] args) {
		BankAccount Jane = new BankAccount();
			Jane.setAccountHolder("Jane Doe");
			Jane.setAccountNumber(123456789654312L);
			
		System.out.println("Name: " + Jane.getAccountHolder());
		System.out.println( "Account Number: "+Jane.getAccountNumber() );
		System.out.println("Available Balance: "+Jane.getAvailableBalance());
		
		Jane.Deposit(2000);
		Jane.ShowBalance(); // 2000
		
		Jane.WithDraw(2500);  // 
		Jane.ShowBalance();
		Jane.Deposit(100000);
		Jane.ShowBalance();
		
		
		BankAccount Cory = new BankAccount();
			Cory.setAccountHolder("Cory");
			Cory.setAccountNumber(9876543212321L);	
		
			Cory.getAccountInfo();
			
			Cory.Deposit(10000);
			Cory.ShowBalance();  // 100000
			Cory.WithDraw(3000);
			
			Cory.getAccountInfo();
			
		
		BankAccount[] accounts = { Jane, Cory };
		
		ArrayList<BankAccount> Accounts = new ArrayList<>();
			//Accounts.add(Jane);
			//Accounts.add(Cory);
		Accounts.addAll(Arrays.asList(Jane, Cory));
		
		
	}

}
