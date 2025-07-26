import java.util.*;
public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0, min, max;

        // Accept 10 numbers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        // Set initial min and max to the first number
        min = numbers[0];
        max = numbers[0];

        // Find min and max
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Calculate average
        double average = sum / 10.0;

        // Display results
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        sc.close();
	}

}
