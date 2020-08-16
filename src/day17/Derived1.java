package day17;

public class Derived1 extends Base {
	String name = "child's name";
	/// method override
	public void sayHi() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("hi from child");
		super.sayHi();
	}
	public void greet() {
		System.out.println("Good morning");
	}
}
