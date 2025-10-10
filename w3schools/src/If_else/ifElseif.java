package If_else;

import java.util.Scanner;

public class ifElseif {

	public static void main(String[] args) {
		//int weather = 1;//1-raining, 2-sunny, 3-cloudy
		Scanner s = new Scanner(System.in);
		
		int weather = s.nextInt();
	
		if(weather == 1) {
			System.out.println("Bring an umbrella");
		}else if(weather == 2){
			System.out.println("Wear sunglasses");
		}else {
			System.out.println("Just go outside normally.");
		}
		
		
		//you can type if like this :
		int time = 20;
		String result = (time > 18) ? "Good day" : "Good evening";
		System.out.println(result);
		
		
		
		
	}
}
