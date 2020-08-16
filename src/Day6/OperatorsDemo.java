package Day6;

public class OperatorsDemo {
	public static void main(String[] args) {
		// Arithmetic Operator
		// +-*%?
		// precedence (priority) + - (low) * / %(modulus) (high)
		System.out.println(5 / 2);// 2 Quotient
		System.out.println(5 % 2);// 1 Remainder

		// Associativity: Left to right

		int a = 4+ 5 - 4 / 2 - 7 % 2 - 2 * 3;
        System.out.println(a);	
}
}
