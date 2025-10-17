package javaArrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		int[][] boxes = { { 10, 2, 3 }, { 4, 5, 6 } };
		System.out.println(boxes[0][1]);
		
		
		
		
		/*				Column 0			Column 1			Column 2
		 * Row 0		  10				   2				   3
		 * Row 1		   4				   5				   6
		 */
//--------------------------------------------------------------------------
		
		int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

		System.out.println("Rows: " + myNumbers.length);             // 2
		System.out.println("Cols in row 0: " + myNumbers[0].length); // 3
		System.out.println("Cols in row 1: " + myNumbers[1].length); // 5
		
		for (int row = 0; row < myNumbers.length; row++) {
			  for (int col = 0; col < myNumbers[row].length; col++) {
			    System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
			  }
			}
	}

}
