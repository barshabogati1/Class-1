package day21;

public class StringDemo2 {
public static void main(String[] args) {
	String s1 = "Nepal";// duita euta memory ma create huncha ani eutai object lai refer gracha
	String s2 = "Nepal";
	String s3 = new String("Nepal");// all new le naya object denote garcha
	String s4 = new String ("Nepal");
	System.out.println(s1 == s2);// true same object lai refer gareko ho ki haina
	System.out.println(s1 == s3);// false
	System.out.println(s1 == s4);//  false
	System.out.println(s3 == s4);// false
	
	
	System.out.println(s1.equals(s2));//true
	System.out.println(s1.equals(s3));//true
	System.out.println(s3.equals(s4));//true
	String s5 = "nepal";
	System.out.println(s1.equals(s5));//false
	
	System.out.println(s1.equalsIgnoreCase(s5));//true
	
	
}
}
