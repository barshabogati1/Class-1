package day4;

public class BlockScopeDemo {// class block start
	static int a = 5; // accessible to everywhere

	public static void main(String[] args) {// main method block start

		int b = 6; // only accessible to somewhere so only to that and child block

	}// main method block ends

}// class block end
// block{ } 