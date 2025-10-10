package If_else;

public class Example {

	public static void main(String[] args) {
		int a = 300;
		int b = 200;
		int c = 100;
		
		
		//Burda her iki sert duz olamlidi yoxsa false verir 
		if(a > b && c < a) {
			System.out.println("Both conditions are true");
		}else {
			System.out.println("Both conditions are false");
		}
		
		//bu ise bir sert duz olasda true verir
		if(a > b || c > a) {
			System.out.println("Burada bir sert veya her ikisi duzdur");
		}
		
		
		//we know "if" run system if Condition true but "!" reverse true or flase Example:  
		// if "if" true this return false and system don't run ,and if "if" false return true
		if(!(c > a)) {
			System.out.println("c a dan boyuk deyil");
		}
		
		
	}
}
