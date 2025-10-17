package Javaoperators;

public class Logical {

	public static void main(String[] args) {
	//	Operator 	Name 			Description 											Example 	
	//	&&  		Logical and 	Returns true if both statements are true 				x < 5 &&  x < 10
	//	||  		Logical or 		Returns true if one of the statements is true 			x < 5 || x < 4 	
	// 	!			Logical not 	Reverse the result, returns false if the result is true !(x < 5 && x < 10)
		//Example
		
		boolean isLoggedIn = true;
		boolean isAdmin = false;

		System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
		System.out.println("Has access: " + (isLoggedIn || isAdmin));
		System.out.println("Not logged in: " + (!isLoggedIn));

		
		
	}
}
