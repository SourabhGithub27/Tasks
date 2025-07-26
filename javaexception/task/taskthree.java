package javaexception.task;

interface RemoteControl {
    abstract void turnOn(); 

    default void batteryStatus() {
        System.out.println("Battery is 80% charged.");
    }
    
    static void info() {
    	System.out.println("Remotecontrol Interface");
    }
}


class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON.");
        
        
    }
}

public class taskthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 TV obj = new TV();
	        obj.turnOn();           // calling abstract method
	        obj.batteryStatus();
	        
	        RemoteControl.info();
	}

}
