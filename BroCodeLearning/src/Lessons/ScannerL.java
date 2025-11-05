package Lessons;


import java.util.Scanner;

public class ScannerL{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double num1;
		double num2;
		char operator;
		double result = 0;
		
		System.out.print("Enter first number: ");
		num1 = s.nextDouble();
		
		
		System.out.print("operator(*,-,/,+): ");
		operator = s.next().charAt(0);
		
		
		System.out.print("Enter second number: ");
		num2 = s.nextDouble();
		
		
	    switch(operator) {
	    case '+' ->  result = num1 + num2;
	    case '-' ->  result = num1 - num2;
	    case '/' ->  result = num1 / num2;
	    case '*' ->  result = num1 * num2;
	    case '^' ->  result = Math.pow(num1, num2);
	    }
		
		
		System.out.println(result);
		
		s.close();
	}
}
