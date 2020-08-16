package day12;

public class Constructor {
	String name;
	int age;

public Constructor( String n, int a) {
	name=n;
	age=a;
	// implicitly call huncha
	System.out.println("constructor called...");
}

	public void printInfo() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}

	public static void main(String[] args) {
		Constructor ob = new Constructor("ram", 22);
		ob.printInfo();
		
		Constructor ob1 = new Constructor("shyam", 22);
		ob1.printInfo();

	}
}
