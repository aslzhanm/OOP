package lab2.problem3;

import java.util.Vector;

public class Bank{
	private Vector<Account> accounts;
	
	Bank(){
		this.accounts = new Vector<>();
	}
	
	void openAcc(Account a) {
		accounts.add(a);
	}
	
	void closeAcc(Account a) {
		accounts.remove(a);
	}
	
	void update() {
		for (Account acc : accounts) {
			if (acc instanceof SavingsAccount) {
				((SavingsAccount) acc).addInterest();
			}else if (acc instanceof CheckingAccount) {
				((CheckingAccount) acc).deductFee();
			}
		}
	}
	

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		Account a1 = new SavingsAccount(1, 5);
		Account a2 = new CheckingAccount(2);
		
		b.openAcc(a1);
		b.openAcc(a2);
		
		a1.deposit(1000);
		a2.deposit(3000);
		
		a2.withdraw(100);
		
		a2.withdraw(100);
		
		a2.withdraw(150);
		
		a2.deposit(100);
		
		
		b.update();
		
		System.out.println(a2);
		
	}

}
