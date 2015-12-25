public class NestLoop {
	public static void main(String[] args) {

	
		for (int i = 0; i < 20; i+=2) {
			for(int k = 0; k < (10-i/2); k++){
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}

