package Lesson_56;

public class Composition {

	public static void main(String[] args) {
	
		/*Композиція*/
		
		Data dn = new Data (1,1,2001);
		Client c = new Client ("Педро", dn );
		
		System.out.printf("%s", c);

	}

}
