package javaMultithreadingtask;

public class RunnableCounter implements Runnable {
	
	@Override
	public void run() {
		for(int i= 1; i <= 10; i++) {
			System.out.println("Number: " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableCounter obj = new RunnableCounter();
		
		Thread t1 = new Thread(obj);
		
		t1.start();
			
			
	}

}
