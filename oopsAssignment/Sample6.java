package oopsAssignment;


class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class Sample6 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

        System.out.println("Int Add: " + calc.add(5, 3));
        System.out.println("Double Add: " + calc.add(2.5, 3.5));
        System.out.println("String Add: " + calc.add("Hello ", "World"));
		
	}

}
