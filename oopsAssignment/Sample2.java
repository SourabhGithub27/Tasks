package oopsAssignment;

class Employee{
	static int count =0;
	String name;
	
	Employee(String name){
		this.name = name;
		count ++;
	}
	void show() {
		System.out.println("Employee name:" + name);
	}
	static void showCount() {
		System.out.println("Total Employees: " + count);
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee("Alex");
		Employee obj1 = new Employee("Bob");
		obj.show();
		obj.show();
		Employee.showCount();
	}

}
