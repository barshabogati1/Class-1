package day22;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Good");
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
