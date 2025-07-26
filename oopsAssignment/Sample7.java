package oopsAssignment;


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}


public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog();
		a1.sound();
		Animal a2 = new Cat();
		a2.sound();
		Animal a3 = new Cow();
		a3.sound();
	}

}
