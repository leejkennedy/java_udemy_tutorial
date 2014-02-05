class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("I can jump " + height + " metres high.");
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " metres in direction " + direction + ".");
	}
}

public class Tutorial20 {

	public static void main(String[] args) {
		
		Robot sam = new Robot();
		
		sam.speak("I AM ROBOT!");
		sam.jump(7);
		sam.move("North", 8);
		
		String greeting = "Hello there !";
				
		sam.speak(greeting);
		
		int value = 14;
		
		sam.jump(value);
		
	}

}
