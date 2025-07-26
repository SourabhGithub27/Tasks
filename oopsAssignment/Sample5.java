package oopsAssignment;


class Vehicle {
    String brand;
    int speed;

    void showDetails() {
        System.out.println("Vehicle: " + brand + ", Speed: " + speed);
    }
}

class Car extends Vehicle {
    Car(String b, int s) {
        brand = b;
        speed = s;
    }
    @Override
    void showDetails() {
        System.out.println("Car: " + brand + ", Speed: " + speed);
    }
}

class Bike extends Vehicle {
    Bike(String b, int s) {
        brand = b;
        speed = s;
    }
    @Override
    void showDetails() {
        System.out.println("Bike: " + brand + ", Speed: " + speed);
    }
}
    
public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cb = new Car("Honda", 100);
		Bike bk = new Bike("Hero", 50);
		
		cb.showDetails();
		bk.showDetails();
	}

}
