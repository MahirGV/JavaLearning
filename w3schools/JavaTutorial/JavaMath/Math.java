package JavaMath;


public class Math {

	public static void main(String[] args) {
		
		int max = StrictMath.max(5, 10);
		System.out.println(max);
		
		
		int min = StrictMath.min(5, 10);
		System.out.println(min);
		
		
		double sqrt = StrictMath.sqrt(32);
		System.out.println(sqrt);
		
		
		float abs = StrictMath.abs(-4.7f);
		System.out.println(abs);
		
		
		double pow = StrictMath.pow(10, 2);
		System.out.println(pow);
		
		StrictMath.round(4.6);  // 5
		StrictMath.ceil(4.1);   // 5.0
		StrictMath.floor(4.9);  // 4.0
		
		//Random numbers
		//0 100 arasi random reqem verir
		double random = (StrictMath.random()) * 101;		
		System.out.println(random);
		
		
		
		
		
	}
}
