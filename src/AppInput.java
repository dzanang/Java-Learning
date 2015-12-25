import java.util.Scanner;

public class AppInput {
	public static void main(String[] args) {

		//Create scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter a floating point value: ");
		
		//Wait for the user to enter a line of text
		double value = input.nextDouble();
		
		//Tell them what they entered
		System.out.println("You entered: " + value);
		
	}
}
