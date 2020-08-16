package Day9;

public class NestedIfDemo {
public static void main(String[] args) {
	int a=5;
	int b=4;
	int c=7;
	if (a>b) {
		
		if (a>c) {
		System.out.println("a is largest one");
	} else {
		System.out.println("c is largets one");
	}
	}
	 else {
			System.out.println(" b is greater than a but c may be smaller or greater than a.");
		}

}
}
