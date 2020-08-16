package day17;

public class Test3 {
	public static void main(String[] args) {
		Derived1 obj = new Derived1();
		// System.out.println(obj.name);//// not appropriate and done so have to call by
		// binding in method see derived
		obj.sayHi();

		System.out.println(obj.getClass());

		System.out.println("===============================");
		//implicit typecasting / Upcasting
		Base parent = new Derived1();
		parent.sayHi();

		// Derived d = new Base(); Garna mildaina
		//explicit type casting  / down casting
		Base base = new Base();
		Derived1 d = (Derived1) base;//???????????
		
		parent.greet();

	}

}
