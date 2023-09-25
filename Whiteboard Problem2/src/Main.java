
public class Main {

	public static void main(String[] args) {
		// prints out 1-100 but skips 25, 50, 75
		for(int i = 1; i <= 100; i++) { 
			if(i == 25) {
				System.out.println();
			} else if(i == 50) {
				System.out.println();
			} else if(i == 75) {
				System.out.println();
			} else {
				System.out.println(i);
			}
		}
	}

}
