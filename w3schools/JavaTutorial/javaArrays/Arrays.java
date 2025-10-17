package javaArrays;

public class Arrays {

	public static void main(String[] args) {

		
		//arrayda sayma 0 dan baslayir yeni '0' birdir  1 ise 2ci indexdir
		
		
		
		// String
		String[] cars = { "Volvo", "BMW", "Audi", "Ferrari" };

		System.out.println("Cars first index: " + cars[0]);

		for (String car : cars) {
			System.out.println(car);
		}

		// int only numbers
		int[] myNum = { 1, 5, 2, 7, 10, 8, 20 };

		System.out.println("myNum,s fourth index: " + myNum[3]);
//-------------------------------------------------------------------------------
		
		//Array icindekini sonradan yazaraq evez etmek olur
		String[] cars2 = { "Volvo", "BMW", "Audi", "Ferrari" };
		
		cars2[0] = "opel";
		
		//bunla indexlerin sayini bile-bilerik
		System.out.println(cars2.length);
		
//-------------------------------------------------------------------------------
		/*You can also create an array by specifying its size with new. 
		This makes an empty array with space for a fixed number of elements, which you can fill later:
		*/
		String[] cars3 = new String[4];
		cars3[0] = "Li auto";
		cars3[1] = "Lamborghini";
		cars3[2] = "Atlas";
		cars3[3] = "Le Mans";
		
		System.out.println(cars3[0]);
		
		
		
		
		
	}
}
