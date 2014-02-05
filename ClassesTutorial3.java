class PersonTest3 {
	String name;
	int age;
	
	void speak(){
		System.out.println("My name is " + name + ".");
	}
	int calculateYearsToRetirement(){
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
	
}

public class ClassesTutorial3 {

	public static void main(String[] args) {
		PersonTest3 person1 = new PersonTest3();
		int age;
		
		person1.name = "David Davidson";
		person1.age = 24;
		//person1.speak();
		
		int years = person1.calculateYearsToRetirement();
		age = person1.getAge();
		
		System.out.println("I am " + age + " years old and I have " + years + " years to retirement.");

	}

}
