package day22;

public class StringDemo6 {
	public static void main(String[] args) {
		String intro = "I am Barsha from Kathmandu, Nepal. I grdauated on may 2020.";
		String[] words = intro.split(" ");
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("************************");
		words = intro.split(", ");
		for (String w : words) {
			System.out.println(w);
		}

	}
}
