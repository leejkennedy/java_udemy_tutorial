/*
 * Setters
 */

class Frog {
	private String name;
	private int age;
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
}

public class Tutorial21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		
		frog1.setInfo("Bertie", 4);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
	}

}
