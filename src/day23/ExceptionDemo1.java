package day23;

import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ExceptionDemo1 ob = new ExceptionDemo1();
		// ExceptionDemo1 ob = null;// nullpointer exception
		
		int div = ob.divide(input);
		System.out.println("division is "+div);
		input.close();
	}
public int divide (Scanner input) {
	System.out.println("Enter a :");
	int a = input.nextInt();
	System.out.println("Enter b: ");
	int b = input.nextInt();
	int div = a/b;
	return div;
}
}
