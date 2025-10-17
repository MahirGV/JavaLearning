package JavaClassesandObjects;



public class Second {
	public static void main(String[] args) {
		Book b = new Book();
		b.id = 5;
		System.out.println(b.id);
		b.name = "Java SE";
		System.out.println(b.name);
		b.author = "Oracle";
		System.out.println(b.author);
		b.pageCount = 500;
		System.out.println(b.pageCount);
		b.description = "In this book you know about Java";
		System.out.println(b.description);
		
		
	}
}
