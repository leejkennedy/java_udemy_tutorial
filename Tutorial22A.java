// Constructors

// Constructors can call other constructors
// Java works out which constructor to use based on the parameters of the calling method
// 
// the This keyword is used to call a constructor from another constructor
// a call to a constructor from another constructor must be the first line of 
// the originating constructor

class MachineA {
	
	private String name;
	private int age;
	
	public MachineA() {
		this("Arnie",0);
		System.out.println("Constructor 1 is running");
	}
	
	public MachineA(String name) {
		this(name,0);
		System.out.println("Constructor 2 is running");
		this.name = name;
	}

	public MachineA(int age) {
		this("Arnie",age);
		System.out.println("Constructor 3 is running");
		this.age = age;
	}
	public MachineA(String name, int age) {
		System.out.println("Constructor 4 is running");
		this.age = age;
	}
	
}

public class Tutorial22A {

	public static void main(String[] args) {
		MachineA machine1 = new MachineA();
		MachineA machine2 = new MachineA("Bertie");
		MachineA machine3 = new MachineA(27);
		MachineA machine4 = new MachineA("Bob",91);
		
	}

}
