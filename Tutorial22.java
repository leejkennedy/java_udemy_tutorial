//Constructors

class Machine {
	
	private String name;
	private int age;
	
	public Machine() {
		name = "Arnie";
		System.out.println("Constructor 1 is running");
	}
	
	public Machine(String name) {
		System.out.println("Constructor 2 is running");
		this.name = name;
	}
	
	public Machine(int age) {
		System.out.println("Constructor 3 is running");
		this.age = age;
	}
	
}

public class Tutorial22 {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine(27);
		
	}

}
