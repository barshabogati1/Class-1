package day23;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.println("enter a: ");
			int a = input.nextInt();
			System.out.println("enter b: ");
			int b = input.nextInt();
			try {
			System.out.println("try start");
			int div = divide (a,b);
			System.out.println("division is "+div);
			} catch(ArithmeticException ae) {
				System.out.println("Inside catch");
			}
			System.out.println("More code");
			System.out.println("More and more code");
			input.close();
			
			String s = "Ra";
			char ch = s.charAt(5);
			System.out.println(ch);
			
			int []arr = {2,3};
			System.out.println(arr[3]);
			input.close();
			
			
		}
		
		public  static int divide(int a, int b) {
			return a/b;
		}
	}
	
	//try == block{}
	//catch  == block{}
	//finally == block{}
	//throws  clause
	//throw  statement
