package javaexception.task;

abstract class PaymentMethod {
    abstract void pay(double amount);
}


class CreditCard extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}


class UPI extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}


class Cash extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }
}


public class taskfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentMethod m1 = new CreditCard();
        PaymentMethod m2 = new UPI();
        PaymentMethod m3 = new Cash();

        m1.pay(1000);
        m2.pay(500);
        m3.pay(200);
	}

}
