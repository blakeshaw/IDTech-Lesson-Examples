
public class Main {

	public static void main(String[] args) {
		int a = 0; 
		int b = 3;
		for(int i = 0; i < 5; i++) { // How many times will the for loop execute? 
			a++; // a = a + 1;
			if(a > b) { // What is this the condition inside the if statement saying? 
				System.out.println("A");
			} else if(a < b) { // What about this condition?
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		} 

	}

}
