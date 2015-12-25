import java.util.Scanner;

public class Printtest {

	public static void main(String[] args) {

		int row;
		int col;

		Scanner input = new Scanner(System.in);
		System.out.println("Insert the number of stars: ");
		int value = input.nextInt();

		for (row = 0; row < value; row++) {
			for(col=0; col<value; col++){
			System.out.print("*");
			
			if(col >= 2 && col <= value){
				System.out.println(" ");
			}
			
				//System.out.print("*");
			}
			System.out.println();
		}
	}

}
