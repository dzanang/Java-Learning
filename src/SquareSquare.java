
public class SquareSquare {
	public void square() {
		int value = 0;
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				int value2 = 0;
				if (i == 0 || i == value2)
					System.out.print("o");

				else if (j == 0 || j == value2)
					System.out.print("+");

				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}