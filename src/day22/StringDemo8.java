package day22;

public class StringDemo8 {
	public static void main(String[] args) {
		System.out.println(isTrue("true"));
		System.out.println(isTrueorYes("True"));
		System.out.println(isTrueorYes("Yes"));
		System.out.println(isEmail("abc"));
		System.out.println(isEmail("abc@gmail.com"));
		System.out.println(isNumberOnly("123"));
	}
	public static boolean isTrue(String s) {
		return s.matches("True|true");
		
	}
	public static boolean isTrueorYes(String s) {
		return s.matches("True|true|Yes");
		
	}
	public static boolean isEmail(String s) {
		return s.matches("^(.+)@(.+)$");
	}
	public static boolean isNumberOnly (String s ) {
		return s.matches("^\\d+$");
	}
	}
