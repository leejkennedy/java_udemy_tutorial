
class PersonTest2 {
	
	// Instance variables (data or "state")
	String name;
	int age;
	
	
	// Classes can contain:
	// 1. data
	// 2. subroutines (methods)
	
	void speak(){
		System.out.println("My name is " + name + ". I am " + age + " years old.");
	}
	void sayHello(){
		System.out.println("Hello !");
	}
	
}
public class ClassesTutorial2 {

	public static void main(String[] args) {
		
	PersonTest2 person1 = new PersonTest2();
	person1.name = "Bob Bobson";
	person1.age=12;
	person1.sayHello();
	person1.speak();
	
	PersonTest2 person2 = new PersonTest2();
	person2.name = "Charles Charleson";
	person2.age=13;
	person2.sayHello();
	person2.speak();
	
	}

}
