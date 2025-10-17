package If_else;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		int x = 13;
		int y = 24;
		
		if(x > 10) {
			System.out.println(x + " is greather than 10");
			
			if(y > 20) {
				System.out.println(y + " isgreather than 20");
			}
		}

		
//-------------------------------------------------------------------------

		int age = n.nextInt();
		boolean isCitizen = n.hasNextBoolean();

		if (age >= 18) {
		  System.out.println("Old enough to vote.");
		  
		  if (isCitizen == true) {
		    System.out.println("And you are a citizen, so you can vote!");
		  } else {
		    System.out.println("But you must be a citizen to vote.");
		  }
		} else {
		  System.out.println("Not old enough to vote.");
		}

	
	
	
	
	
	}
	
}
