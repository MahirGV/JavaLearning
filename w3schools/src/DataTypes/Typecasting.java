package DataTypes;

public class Typecasting {

	public static void main(String[] args) {
		
		//primitivin deyismesi
		//Widening casting(automatic)
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt);    // Outputs 9
		System.out.println(myDouble); // Outputs 9.0
		
		//Narrowing casting(manual)
		double a = 9.99d;
		int my = (int) a;
		
		System.out.println(a);
		System.out.println(my);
		
		
		
		//Real-Life Examples
		// Set the maximum possible score in the game to 500
		int maxScore = 500;

		// The actual score of the user
		int userScore = 423;

		/* Calculate the percentage of the user's score in relation to the maximum available score.
		Convert userScore to double to make sure that the division is accurate */
		double percentage = (double) userScore / maxScore * 100.0d;

		System.out.println("User's percentage is " + percentage);

		

	}
}
