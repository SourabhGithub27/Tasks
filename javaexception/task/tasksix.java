package javaexception.task;


interface Controllable {
    void turnOn();  

    default void status() {
        System.out.println(" Device is working");
    }

    static void deviceInfo() {
        System.out.println("Smart devices are cool!");
    }
}

class SmartLight implements Controllable {
    public void turnOn() {
        System.out.println("Smart Light is turned ON");
    }
}


class SmartFan implements Controllable {
    public void turnOn() {
        System.out.println("Smart Fan is turned ON");
    }
}
public class tasksix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		SmartLight light = new SmartLight();
        SmartFan fan = new SmartFan();

      
        light.turnOn();
        light.status();

        fan.turnOn();
        fan.status();

       
        Controllable.deviceInfo();
	}

}
