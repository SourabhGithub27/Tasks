package javaexception.task;


class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message); // Call parent constructor
    }
}

public class taskten {

	static void checkBalance(double balance) throws InvalidAccountException {
        if (balance < 0) {
            throw new InvalidAccountException("Invalid account balance: Balance cannot be negative.");
        } else {
            System.out.println("Balance is valid: " + balance);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            double accountBalance = -500.0; 
            checkBalance(accountBalance);   
        } catch (InvalidAccountException e) {
            System.out.println(  e.getMessage());
        }
		
	}

}
