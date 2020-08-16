package day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    int [] arr = new int[2];
		try {

				
				System.out.println("enter a: ");
				int a = input.nextInt();
				System.out.println("enter b: ");
				int b = input.nextInt();
				System.out.println("try start");
				int div = divide (a,b);
				System.out.println("division is "+div);
				System.out.println(arr[2]);
		} catch(ArithmeticException|InputMismatchException ae) {
			System.out.println("ae");
			ae.printStackTrace();
		} 
		
		System.out.println("More code");
		System.out.println("More and more code");
		
	}
	public  static int divide(int a, int b) {
		return a/b;
	}

}
