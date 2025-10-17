package javaArrays;

public class RealLifeExamples {
	public static void main(String[] args) {
		// An array storing different ages
		int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

		float avg, sum = 0;

		// Get the length of the array
		int length = ages.length;

		// Loop through the elements of the array
		for (int age : ages) {
			sum += age;
		}

		// Calculate the average by dividing the sum by the length
		avg = sum / length;

		// Print the average
		System.out.println("The average age is: " + avg);

//----------------------------------------------------------------------
		// The lowest age

		int length2 = ages.length;

		int lowestAge = ages[0];//20

		for (int age2 : ages) {
			if (lowestAge > age2) {
				lowestAge = age2;
			}
		}
		System.out.println("The lowest age is :" + lowestAge);
	}
}
