
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        System.out.println("Original a: " + a);
        System.out.println("Pre-increment (++a): " + (++a)); 
        System.out.println("Post-increment (a++): " + (a++)); 
        System.out.println("After post-increment, a: " + a); 

        // Bitwise Shift
        int number = 8; 
        System.out.println("\nLeft Shift (8 << 1): " + (number << 1)); 
        System.out.println("Right Shift (8 >> 1): " + (number >> 1)); 

        // Logical AND (&&) vs Bitwise AND (&)
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical AND (x && y): " + (x && y)); 
        System.out.println("Bitwise AND (x & y): " + (x & y));   

        // Bitwise AND on numbers
        int p = 6;  // 110
        int q = 3;  // 011
        System.out.println("Bitwise AND on numbers (6 & 3): " + (p & q)); // 2
	}

}
