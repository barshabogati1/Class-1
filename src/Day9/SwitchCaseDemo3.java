package Day9;

import java.util.Scanner;

public class SwitchCaseDemo3 {
public static void main(String[] args) {
	
	Scanner input= new Scanner (System.in);
	System.out.println("ENter your choice:");
	String choice = input.next();
	
	switch(choice) {
	case "Add":
		System.out.println("This is addition. ");
		break;
	case "Subtract":
	System.out.println("This is subtraction. ");
	break;
	case "Multiply":
	System.out.println("This is Multiplication. ");
	break;
	case "Divide":
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
