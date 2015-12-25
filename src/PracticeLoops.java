import java.util.Scanner;

public class PracticeLoops {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		System.out.println("Please enter your timer value: ");
		//int i =  input.nextInt();
		
		for(int i=input.nextInt(); i >= 0; i--){
			System.out.println(i);
		}
		
	
	}
	}
