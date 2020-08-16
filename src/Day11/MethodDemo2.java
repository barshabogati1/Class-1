package Day11;

import java.util.Scanner;

public class MethodDemo2 {
	
	public static void printInfo(String name,int age) {
		System.out.println("name is " + name);
		System.out.println("Age is "+age);
	}
	
	public static void main(String[] args) {
		printInfo("Ram",22);
		
		Scanner input = new Scanner ( System.in);
		System.out.println("Please enetr the name:");
		String n = input.next();
		System.out.println("Please enter the age:");
		int a= input.nextInt();
		printInfo( n, a);
		input.close();
	}

}
