package Javaoperators;

public class Strings {

	public static void main(String[] args) {
		String greeting = "hello";
		
		String sudo = "Mahir is root if computer";
		System.out.println(sudo.length());
		
//----------------------------------------------------------------------------
		
		//toUpperCase() and toLowercase()		
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"

//----------------------------------------------------------------------------
		
		//indexOf()
		String su = "Hello Iam Mahir and i root of computer";
		System.out.println(su.indexOf("Mahir")); //output 10

//----------------------------------------------------------------------------
		
		//chatAT()
		String text = "Salam";
		System.out.println(text.charAt(0));// S
		System.out.println(text.charAt(4));// m
		
//----------------------------------------------------------------------------
		
		//equals()
		String txt1 = "Hello";
		String txt2 = "Hello";

		
		String txt3 = "Greetings";
		String txt4 = "Great things";

		System.out.println(txt1.equals(txt2));  // true
		System.out.println(txt3.equals(txt4));  // false
		
//----------------------------------------------------------------------------		
		
		//trim()
		String txt5 = "   Hello World   ";
		System.out.println("Before: [" + txt5 + "]");
		System.out.println("After:  [" + txt5.trim() + "]");

		
	}
}
