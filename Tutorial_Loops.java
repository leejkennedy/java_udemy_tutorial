public class Tutorial_Loops {
	public static void main(String[] args) {
		int value = 10;
		boolean myBoolean = true;
		
		while (myBoolean) {
			System.out.println(value);
			value++;
			myBoolean = value <= 20;
		}

	}
}
