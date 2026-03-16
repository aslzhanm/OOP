package lab2.problem3;

public class SavingsAccount extends Account{
	private double interestRate;
	SavingsAccount(int a, double i){
		super(a);
		this.interestRate = i;
	}
	
	void addInterest() {
		double interest = balance * (interestRate/100);
		balance += interest;
	}
	
	@Override public String toString() {
		return super.toString() + "\ninterest rate: " + interestRate;
	}
	
	
	
}
