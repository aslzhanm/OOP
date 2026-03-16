package lab2.problem3;

public class Account {
	protected int accNumber;
	protected double balance;
	Account(int a){
		this.accNumber = a;
		this.balance = 0;
	}
	
	void deposit(double sum) {
		balance += sum;
	}
	
	void withdraw(double sum) {
		if (balance >= sum)
			balance -= sum;
	}
	
	int getAccNum() {
		return accNumber;
	}
	
	double getBalance() {
		return balance;
	}
	
	void transfer(double amount, Account other) {
		this.withdraw(amount);
		other.deposit(amount);
	}
	
	public String toString() {
		return "acc num: " + accNumber + "\nbalance: " + balance;
	}
	
	final void print() {
		System.out.println(toString());
	}
}


