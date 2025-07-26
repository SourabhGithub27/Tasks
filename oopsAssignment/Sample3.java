package oopsAssignment;

class BankAccount{
	private double balance;
	
	BankAccount(double initialBalance){
		balance = initialBalance;
	}
	
	void deposit(double amount) {
		if(amount > 0) 
		balance += amount;
	}
	
	void withdraw(double amount) {
		if(amount > 0 && amount <= balance) 
		balance -= amount;
	}
	
	double getBalance() {
		return balance;
	}
}
public class Sample3 {

	public static void main(String[] args) {
		
		BankAccount ac = new BankAccount(1000);
		ac.deposit(500);
		ac.withdraw(200);
		
		System.out.println("Balance: " + ac.getBalance());
		

	}

}
