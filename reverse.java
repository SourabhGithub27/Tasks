public class reverse {

	public static void main(String[] args) {
		
		if (args.length == 0) {
            System.out.println("Please enter some words.");
            return;
        }

        System.out.print("Reversed: ");

        // Loop through each word passed as argument
        for (String word : args) {
            String reversedWord = "";

            // Loop to reverse each word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }

            
            System.out.print(reversedWord + " ");
        }

        System.out.println(); 
	}

}
