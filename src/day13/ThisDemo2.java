package day13;

public class ThisDemo2 {
	String name;
	int age;
	
	public ThisDemo2( String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void printInfo() {
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
	}

	public static void main(String[] args) {
		ThisDemo2 ob = new ThisDemo2("Ram", 22);
		ob.printInfo();

	}

}
