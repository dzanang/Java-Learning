
public class StringFormating {

	public static void main(String[] args) {

		String info = "";

		// Inefficient
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";

		System.out.println(info);

		// More efficient
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();

		s.append("My name is Roger.").append("").append("I am a skydiver.");

		System.out.println(s.toString());
		
		// Formatting//////////////////
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a new line.");
		
		System.out.printf("Total cost %10d;\n quantity is %d\n", 5, 120);
		
		for(int i = 90; i<101; i++){
			System.out.printf("%3d: some text here\n", i);
		}
		
		System.out.printf("Total value: %.2f\n", 5.6);
		System.out.printf("Total value: %.3f", 343.23423);
	}
	

}
