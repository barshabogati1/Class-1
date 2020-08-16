package Day11;

import java.util.Scanner;

public class MethodDemo4 {
	public static int findMax(int a, int b) {
		int max=0;
		if (a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the value of a");
		int a = input.nextInt();
		System.out.println("Please enter the value of b");
		int b = input.nextInt();
		int m = findMax(a,b);
		
		System.out.println("Max num is "+ m);
		
		

	}
}
