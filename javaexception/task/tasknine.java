package javaexception.task;

public class tasknine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
           
            int[] numbers = new int[3];
          
            numbers[3] = 100 / 0;  
            

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
	}

}
