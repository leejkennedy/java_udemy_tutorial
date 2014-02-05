public class MultiDimArrays {
	public static void main (String[] args) {
		int[] values = {53,79,155};
		System.out.println(values[2]);
		
		int[][] grid = {
			{53,79,155},
			{18,58,8},
			{0,1,2}
		};
		
		System.out.println(grid[0][1]);
		System.out.println(grid[0][2]);
		System.out.println(grid[2][2]);
		
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello!";
		
		System.out.println(texts[0][1]);
		
		for(int row=0; row<grid.length;row++) {
			for(int col=0; col<grid.length;col++) {
				System.out.print(grid[row][col] + "\t");
			}
			
			String words[][] = new String[2][];
			
			System.out.println(words[0]);
			
			words[0] = new String[3];
			words[0][1] = "Hi there!";
			
			System.out.println(words[0][1]);
		}
	}
}
