package javaMethodParameters;

public class Main {

	static void myMethod(String fname, int age, String gender){
		System.out.println();
		System.out.println(fname +" Mehtizade |"+age+": Years old |"+gender+": Male");
		System.out.println();
		if(18 < age) {
			System.out.println(fname + " Access granted - You are old enough!");
		}else {
			System.out.println(fname +" Access denied - You are not old enough!");
		}
		
	}
}
