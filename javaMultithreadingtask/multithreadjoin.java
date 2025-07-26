package javaMultithreadingtask;

public class multithreadjoin  extends Thread{
	
	@Override
    public void run() {
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1 - Number: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread1 was interrupted.");
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		multithreadjoin thread1 = new multithreadjoin(); // Create thread1

        thread1.start(); 

        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        
        System.out.println("Thread execution completed");
	}
	 

}
