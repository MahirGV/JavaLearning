package Javaoperators;

public class Operators {

	public static void main(String[] args) {
		
		// + operator
		int u = 100 + 50;
		System.out.println(u);
		
		int sum1 = 100 + 50;
		int sum2 = 100 + sum1;
		int sum3 = sum1 + sum2;
		
		
		// + 	Addition 	Adds together two values 	x + y 	
		// - 	Subtraction 	Subtracts one value from another 	x - y 	
		// * 	Multiplication 	Multiplies two values 	x * y 	
		// / 	Division 	Divides one value by another 	x / y 	
		// % 	Modulus 	Returns the division remainder 	x % y 	
		// ++ 	Increment 	Increases the value of a variable by 1 	++x 	
		// -- 	Decrement 	Decreases the value of a variable by 1 	--x
		
		//Example
		int e = 10;
		int y = 3;

		System.out.println(e + y); // 13
		System.out.println(e - y); // 7
		System.out.println(e * y); // 30
		System.out.println(e / y); // 3
		System.out.println(e % y); // 1

		int z = 5;
		++z;
		System.out.println(z); // 6
		--z;
		System.out.println(z); // 5
		

		//Qiymet kesrle olanda
		int a = 10;
		int b = 3;
		System.out.println(a / b);   // Integer division, result is 3

		double c = 10.0d;
		double d = 3.0d;
		System.out.println(c / d);   // Decimal division, result is 3.333...

//----------------------------------------------------------------------------		
		
		//Incrementing and Decrementing
		int x = 5;

		++x; // Increment x by 1
		System.out.println(x); // 6

		--x; // Decrement x by 1
		System.out.println(x); // 5
		
//----------------------------------------------------------------------------
		
		int peopleInRoom = 0;

		// 3 people enter
		peopleInRoom++;
		peopleInRoom++;
		peopleInRoom++;

		System.out.println(peopleInRoom); // 3

		// 1 person leaves
		peopleInRoom--;

		System.out.println(peopleInRoom); // 2




		
		
	}
}
