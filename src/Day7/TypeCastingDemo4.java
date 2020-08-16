package Day7;

public class TypeCastingDemo4 {
public static void main(String[] args) {
	
	boolean b= true;
	 //int i=b; ( no type casting of boolean)
	
	int a =5;
	// boolean bb =a; ( no type casting)
	
	char c1 =97;
	short s1=97;
	System.out.println(c1);//1
	System.out.println(s1);//97
	
	char c2= 'a';
	short s2='a';
	System.out.println(c2);//a
	System.out.println(s2);//97
	
	char c3= 65;
	//short s3= c3; mildaina
	short s3= (short)c3;
	System.out.println(c3);// A
	System.out.println(s3); // 97
}
}
