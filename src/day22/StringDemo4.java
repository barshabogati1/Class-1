package day22;

public class StringDemo4 {
public static void main(String[] args) {
	String s1 = "Good Morning";
	System.out.println(s1.substring(5));//Morning
	System.out.println(s1.substring(0,4));//Good
	System.out.println(s1.charAt(3));
	System.out.println(s1.indexOf("d"));
	System.out.println(s1.contains("r"));
	System.out.println(s1.contains("Morning"));
	System.out.println(s1.length());
	System.out.println(s1.isEmpty());
	System.out.println("Hello ".concat(s1));
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	
	//System.out.println(s1(0)); mildaina
	char []ch = s1.toCharArray();
	
	System.out.println(ch[2]);
	
	System.out.println(s1.replace("Morning", "Evening"));
	String s2 = " Barsha Bogati The Great ";
	System.out.println(s2.trim());// space hataucha agadi ra pachadi ko
	s1.compareTo("Good Morning");
	if ( s1.compareTo("Goor Morning") == 0){
		System.out.println("Both strings are equal. ");
		
	}else
		System.out.println("Both strings are not equal." );
	
}
}
