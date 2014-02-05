
class PersonTest1 {
	
	// Instance variables (data or "state")
	String name;
	int age;
	
	
	// Classes can contain:
	// 1. data
	// 2. subroutines (methods)
	
}
public class ClassesTutorial1 {

	public static void main(String[] args) {
		
	PersonTest1 person1 = new PersonTest1();
	person1.name = "Bob Bobson";
	person1.age=12;
	
	PersonTest1 person2 = new PersonTest1();
	person2.name = "Charles Charleson";
	person2.age=13;

	System.out.println(person1.name + " (" + person1.age +")");
	System.out.println(person2.name + " (" + person2.age +")");
	
	}

}
