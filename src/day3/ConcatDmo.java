package day3;

public class ConcatDmo {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		String name = " ram thapa";
		String greet = "Hello, ";
		System.out.println("Hello");
		System.out.println("Hello, " + name); // concat gareko /jodeko
		System.out.println(greet + name);
		System.out.println(a + b);
		System.out.println(a + "" + b);// string le concat gardincha
		System.out.println(a + name + b);
		System.out.println("sum is: " + a + b);
		System.out.println("sum is " + (a + b));

	}

}
