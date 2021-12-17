package application;

public class App {

	public static void main(String[] args) {

		int counter = 0;
		// while continues to run while the condition is true
		while (counter < 10) {
			System.out.printf("Counter: %d\n", counter);
			counter = counter + 1;
		}
		
		int counter2 = 0;
		while (counter2 < 5) {
			System.out.println("Hello");
			counter2 += 1;
		}
	}

	public String printHello(int endNumber) {
		int startNumber = 0;
		String outputString = "Hello";
		while (startNumber < endNumber) {
			//System.out.print("Hello");
			outputString = outputString + outputString;
		}
		return outputString;
	}
}
