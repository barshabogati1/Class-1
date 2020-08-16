package day22;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	public static void main(String[] args) {
		String intro = "I am Barsha from Kathmandu, Nepal. I grdauated on may 2020.";
		StringTokenizer st = new StringTokenizer(intro);
		
		Scanner sc = new Scanner(System.in);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	System.out.println("*********============***********");
	
	st = new StringTokenizer(intro,"");
	while (st.hasMoreTokens()) { //MoreElement is also okay
		System.out.println(st.nextToken());
	}
	
	}

}
