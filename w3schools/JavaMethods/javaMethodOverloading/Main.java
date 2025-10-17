package javaMethodOverloading;

public class Main {

	static int plusMethod(int x, int y) {
		return x + y;
	}

	static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int x = plusMethod(5, 10);
		double y = plusMethod(4.3, 26.7);
		System.out.println(x);
		System.out.println(y);
	}

}
