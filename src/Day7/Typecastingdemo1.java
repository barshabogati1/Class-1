package Day7;

public class Typecastingdemo1 {
	public static void main(String[] args) {
		// implicit casting
		//by compiler
		byte b = 127;
		int i = b;
		System.out.println("b is " + b);
		System.out.println("i is " + i);
		//explicit conversion
		int ii=127;
		int bb= ii;
		System.out.println("ii is: "+ii);
		System.out.println("bb is: "+bb);
	}
}
