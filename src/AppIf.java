
public class AppIf {
	public static void main(String[] args) {
		
		int looop = 0;
		
		while(true){
			System.out.println("looping: " + looop);
			
			if(looop == 5){
				break;
			}
			looop++;
			System.out.println("Running");
		}
	}
}

	/**	if(myInt < 10){
			System.out.println("Yes, its true.");
		}
		else if (myInt > 20){
			System.out.println("No, Its false.");
		}
		else {
			System.out.println("Your int sucks.");
		}
	}
} **/
