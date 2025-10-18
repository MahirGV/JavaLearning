package javaClassMethod;

import java.util.Scanner;

public class Autoban {
	public static void main(String[] args) {
		Main audi = new Main();
		Scanner s = new Scanner(System.in);
		
		
		
		int x = audi.speed(s.nextInt());
		if (x >= 200) {
			audi.throttle();
		}
	}
}
