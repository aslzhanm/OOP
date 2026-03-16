package lab2.problem3;

public class CheckingAccount extends Account {
	private int transactionsCount;
	static final int FREE_TRANSACTIONS = 3;
	
	CheckingAccount(int accNum) {
		super(accNum);
		this.transactionsCount = 0;
	}
	
	@Override void withdraw(double sum) {
		if (balance >= sum) {
			balance -= sum;
			transactionsCount++;
		}
	}
	
	@Override void deposit(double sum) {
		super.deposit(sum);
		transactionsCount++;
	}
	
	void deductFee() {
		if (transactionsCount > FREE_TRANSACTIONS) {
			double fee = (transactionsCount - FREE_TRANSACTIONS) * 0.02;
			super.withdraw(fee);
		}
	}
	
	@Override public String toString() {
		return super.toString();
	}
	
	

}
