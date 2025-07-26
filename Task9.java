
public class Task9 {
	byte myByte;
    short myShort;
    int myInt;
    long myLong;
    float myFloat;
    double myDouble;
    char myChar;
    boolean myBoolean;
    String myString; 

    public void printValues() {
        System.out.println("Default byte: " + myByte);
        System.out.println("Default short: " + myShort);
        System.out.println("Default int: " + myInt);
        System.out.println("Default long: " + myLong);
        System.out.println("Default float: " + myFloat);
        System.out.println("Default double: " + myDouble);
        System.out.println("Default char: [" + myChar + "]");
        System.out.println("Default boolean: " + myBoolean);
        System.out.println("Default String (reference): " + myString);
    }
	

	    public static void main(String[] args) {
	        Task9 obj = new Task9(); // Create object
	        obj.printValues(); // Print default values
	}

}
