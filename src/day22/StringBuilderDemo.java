package day22;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String s1 = "Good";
		System.out.println(s1);
		s1.concat(" Morning");
		// String s = s1.concat(" Morning");
		System.out.println(s1);

		// TO REVERSE
		String r = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			r = r + s1.charAt(i);

		}
		System.out.println(r);
		
		String s = "abc";
		s = s.concat("x");
		System.out.println(s);

		System.out.println("===============");
		// FOR MUTABLE STRING
		StringBuilder sb = new StringBuilder("Good");
		System.out.println(sb);
		sb.append(" Morning");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 8);
		System.out.println(sb);
		// sb.replace
		sb.insert(0, "Hello");
		System.out.println(sb);
	}

}
