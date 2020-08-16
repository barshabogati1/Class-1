package Day6;

public class OperatorsDemo2 {
   public static void main(String[] args) {
	//Assignment Operator = Compound += -= *= /= %=
	   //Associativity right to left
		int a = 4+ 5 - 4 / 2 - 7 % 2 - 2 * 3;
		System.out.println(a);
		
		int x=5;
		System.out.println(x);
		x=x+2;
		System.out.println(x);
		
		x +=2; // x= x+2;
		System.out.println(x);
		
		
}
}
