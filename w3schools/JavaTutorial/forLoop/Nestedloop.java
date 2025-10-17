package forLoop;

import java.util.Iterator;

public class Nestedloop {

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) {

			System.out.println("Outer loop: " + i);

			for (int j = 0; j <= 3; j++) {
				System.out.println("Inner loop: " + j);
			}
		}
		 /*	Outer loop: 0
			Inner loop: 0
			Inner loop: 1
			Inner loop: 2
			Inner loop: 3
			Outer loop: 1
			Inner loop: 0
			Inner loop: 1
			Inner loop: 2
			Inner loop: 3
			Outer loop: 2
			Inner loop: 0
			Inner loop: 1
			Inner loop: 2
			Inner loop: 3
		 */
			
		//Multiplication Table Example
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.println(i * j);
			}
			System.out.println();
		}
			
			
			
			
			

		

	}
}
