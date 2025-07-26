package oopsAssignment;


interface Logger {
    default void logInfo() {
        System.out.println("Info: Operation completed.");
    }

    static void logError() {
        System.out.println("Error: Something went wrong.");
    }
}


class AppLogger implements Logger {}
public class Sample9 {

	public static void main(String[] args) {
		
		AppLogger logger = new AppLogger();
		logger.logInfo();
		Logger.logError();

	}

}
