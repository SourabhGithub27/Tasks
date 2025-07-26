package javaexception.task;

public class taskeight {
	
	static void validateage(int age) throws Exception{
		if(age < 18) {
			System.out.println("You must be 18+ to vote");
		} else {
			System.out.println("You can vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			validateage(18);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
