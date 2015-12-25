import java.util.Scanner;

public class SquareLoop {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Please enter your star value: ");
		int value = input.nextInt();
		System.out.println("Please enter the second square value: ");
		int value2 = input.nextInt();

		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				if (i != value2 || i != value && j != value2 || j != value)
					System.out.print(" ");
				if (i == 0 || i == value - 1)
					System.out.print("*");

				else if (j == 0 || j == value - 1)
					System.out.print("*");

				/*if (i == 5 || i == value2)
					System.out.print("o");

				else if (j == 5 || j == value2)
					System.out.print("+");*/

				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
