package javaexception.task;

import java.util.Scanner;

public class taskseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner scanner = new Scanner(System.in);  // Create scanner object

        System.out.print("Enter a number to divide 100 by: ");
        int number = scanner.nextInt();  // Take integer input from user

        try {
            int result = 100 / number;  // Try dividing 100 by the entered number
            System.out.println("Result: 100 / " + number + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
	}

}
