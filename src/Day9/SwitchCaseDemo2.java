package Day9;

import java.util.Scanner;

public class SwitchCaseDemo2 {
public static void main(String[] args) {
	Scanner input= new Scanner (System.in);
	System.out.println("ENter your choice:");
	char choice = input.next().charAt(0);
	
	switch(choice) {
	case '+':
		System.out.println("This is addition. ");
		break;
	case '-':
	System.out.println("This is subtraction. ");
	break;
	case '*':
	System.out.println("This is Multiplication. ");
	break;
	case '/':
	System.out.println("This is division. ");
	break;
	default:
		System.out.println("wrong chpice. ");
		
	}
	System.out.println("More code");
	System.out.println("exit");
	input.close();
	
}
}
