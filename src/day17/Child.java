package day17;

public class Child extends Parent{
	String name = "Child's name"; // hiding variable
	
	public void sayHello () {
		System.out.println("Hello from child "); //overriding method
	}

}
