package day23;

import java.util.Scanner;

public class ExceptionDemo3 {public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("enter a: ");
	int a = input.nextInt();
	System.out.println("enter b: ");
	int b = input.nextInt();
	try {
	System.out.println("try start");
	int div = divide (a,b);
	System.out.println("division is "+div);
	System.out.println("Try end");
	} catch(ArithmeticException ae) {
		System.out.println("Inside catch");
	} finally {
		// finally always runs eg.. clode, resource
		System.out.println("inside finally block");
		input.close();
	}
	System.out.println("More code");
	System.out.println("More and more code");
	
	
//	String s = "Ra";
//	char ch = s.charAt(5);
//	System.out.println(ch);
//	
//	int []arr = {2,3};
//	System.out.println(arr[3]);
//	input.close();
//	
	
}

public  static int divide(int a, int b) {
	return a/b;
}
}



