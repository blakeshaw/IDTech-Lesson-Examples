
public class Main {

	public static void main(String[] args) {
		String[][] grid = new String[5][4]; // creating a new 2D array [rows] [columns]
		// Why are we using a nested for loop here?
		for(int i = 0; i < grid.length; i++) { // what does int i represent?
			System.out.print("* ");
			for(int j = 0; j < grid.length; j++) { // what does int j represent?
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
