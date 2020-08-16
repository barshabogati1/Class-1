package day13;

public class ThisDemo1 {
	//instance variable
	int a =5;
	
	public void display() {
		System.out.println(a);
		int a=6;
		System.out.println(a);
	    int sum = a + this.a;
	    System.out.println("sum is "+ sum);
	}
public static void main(String[] args) {
	ThisDemo1 ob1 = new ThisDemo1();
	System.out.println("The ob1 is: "+ob1);
	ob1.display();
	System.out.println("=========================");
	ThisDemo1 ob2 = new ThisDemo1();
	System.out.println("The ob1 is: "+ob2);
	ob1.display();
}
}
