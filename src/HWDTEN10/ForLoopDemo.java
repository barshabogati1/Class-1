package HWDTEN10;

import java.util.Scanner;

public class ForLoopDemo {
	// instance variable
	int a; // assign default value
	
	public static void main(String[] args) {
		
		ForLoopDemo ob = new ForLoopDemo();
		System.out.println(ob.a);
		
 // for (initialization; condition; update) (increment/decrement)
	Scanner input = new Scanner(System.in);
	System.out.println("enter number");
	int n = input.nextInt();
	// local variable must be iniktialized give default value
	int sum = 0;
	for (int i=1; i<= n; i++) {
		sum = sum + i;
		System.out.println(i);
	}
	System.out.println(" The total sum is "+sum);
	input.close();
  }
}
