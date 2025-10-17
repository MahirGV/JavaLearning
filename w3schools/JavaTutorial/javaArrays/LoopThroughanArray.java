package javaArrays;


public class LoopThroughanArray {

	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Audi", "Ferrari" };
		
		//We have 2 type to print all index in cars both of them use for but different
		//first:
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		//second
		for (String car : cars) {
			System.out.println(car);
		}
		
		
//-----------------------------------------------------------		
		
		
		
		int[] numbers = {1, 5, 10, 25};
		int sum = 0;

		// with for loop you can sum array numbers
		for (int i = 0; i < numbers.length; i++) {
		  sum += numbers[i];
		  System.out.println("The sum is: " + sum);
		}

		
		
		
		
	}
}
