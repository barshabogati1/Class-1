package Day7;

public class Operatordemo5 {
public static void main(String[] args) {
	//Logical operator
	//&&(And)  || (or)     !(Not)
	
	System.out.println(true && true); //true
	System.out.println(true && false);//true
	System.out.println(false && true);//false
	System.out.println(false && false);//false
	
	
	System.out.println(true || true); //false
	System.out.println(true || false);//false
	System.out.println(false || true);//false
	System.out.println(false || false);//true
	
	System.out.println(!true ); //false
	System.out.println(!false );//true
	
}
}

