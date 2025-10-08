package variables;

public class javaVariables {

public static void main(String[] args) {
		
		
		int myNum = 5;
		System.out.println(myNum);
		
		float myFloatNum = 1.3f;
		System.out.println(myFloatNum);
		
		char myLetter = 'M';
		System.out.println(myLetter);
		
		boolean myBool = true;
		System.out.println(myBool);
		
		String myText = "Hello";
		System.out.println(myText);

		final int my= 10;
		System.out.println(my);
		//Difference Between "final int" and deafult "int" you can change int but final int you can't 
		//example
		int myS = 5;
		myS = 10;
		System.out.println(myS);
		//output will be 10 
		final int myT = 4;
		//myT = 6;
		//how you can see this gives error
	}

}
