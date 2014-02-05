public class Conditional {

	public static void main(String[] args) {
		
		boolean cond = false;
		int low = 4;
		int high = 5;
		int loop = 0;
		
		while (loop < 5) {
			System.out.println(loop);
			loop++;
			if (loop == 3) {
				System.out.println("The loop got to " + loop + "!");
				break;
			}
		}
		
		if (cond = low == high) {

			System.out.println(cond);
			
		}
		else if (low == 3) {
			System.out.println("Phew: low = " + low);
		}
		else {
			System.out.println("Are you mad !");
		}
	}

}