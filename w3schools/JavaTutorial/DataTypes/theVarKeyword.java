package DataTypes;

import java.util.ArrayList;

public class theVarKeyword {

	public static void main(String[] args) {
		//var is a  universal for example
		var myNum = 5;
		
		var myDouble = 2.2;
		var myBoolean = true;
		var myChar = 'M';
		var myText = "String";
		
		//Important notes
		//var x; // Error
		var x = 5;  // OK
		
		var v = 5; //x is a now int 
		v = 7; //ok still int
		//x = 9.99; //Erorr can't assign double to a int
		
		//When we use var
		//without var
		ArrayList<String> cars = new ArrayList<String>();
		
		//With var
		
		var car = new ArrayList<String>();
		
	}
}
