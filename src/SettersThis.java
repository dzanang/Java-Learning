class Frog{
	String name;
	int age;
	
	public void setName(String newName){
		name = newName;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

public class SettersThis {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		//frog1.name = "Bertie";
		//frog1.age = 1;
		
		frog1.setName("Bertie");
		frog1.setAge(1);
		
		System.out.println(frog1.getName());

	}

}
