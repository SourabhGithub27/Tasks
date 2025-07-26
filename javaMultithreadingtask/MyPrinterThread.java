package javaMultithreadingtask;

public class MyPrinterThread extends Thread{
	@Override
    public void run() {
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Thread!");

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        MyPrinterThread thread = new MyPrinterThread(); 
        thread.start(); 

		
	}

}
