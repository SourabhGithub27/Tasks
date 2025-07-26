package oopsAssignment;


abstract class Appliance {
    abstract void turnOn();  // Abstract method
}


interface Connectable {
    void connect();          // Interface method
}


class SmartTV extends Appliance implements Connectable {
    public void turnOn() {
        System.out.println("SmartTV is turned ON");
    }

    public void connect() {
        System.out.println("SmartTV is connected to Wi-Fi");
    }
}
public class Sample8 {

	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.connect();

	}

}
