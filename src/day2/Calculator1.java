package day2;

public class Calculator1 {

	public static void main(String[] args) {
		System.out.println(4+5);
		
		int a = 4;
		int b= 6;
		System.out.println(a+b);
		int sum = a+b;
		System.out.println(sum);
		System.out.println("The sum of a and b is:"+sum);
		System.out.println("The sum of "+ a + " and "  + b +  " is:" + sum);
		
		int sub = a - b;
		System.out.println("Subtraction of  "+ a + " and "  + b +  " is:" + sub);
		
		int mul = a * b;
		System.out.println("Multiplication of  "+ a + " and "  + b +  " is:" + mul);
		
		int div = a/b;
		System.out.println("Division of  "+ a + " and "  + b +  " is:" + div);
	}
}
