class Person{
	String name;
	int age;
	
	void speak(){
		System.out.println("My name is: " + name);
	}
	int claculateYearsToRetirement(){
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	int getAge(){
		return age;
	}
}
public class GettersRValues {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.age = 25;
		
		person1.speak();
		
		int years = person1.claculateYearsToRetirement();
		
		System.out.println("Years till returement: " + years);
		
		int age = person1.getAge();
		
		System.out.println("At the moment I am " + age + " years of age.");
	}
}
