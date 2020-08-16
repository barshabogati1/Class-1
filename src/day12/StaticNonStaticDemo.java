package day12;

public class StaticNonStaticDemo {
String nonStaticVar = " this is non static variable";
	
	static String staticVar = "This is static variable";
	
	//Non-Static method ( we have to call)
	public void sayHello() {
		System.out.println("Hello from Nepal");
	}
	//Static Method
	public static void sayHi() {
		System.out.println("Hello from Usa");
	}
 	public static void main(String[] args) {
 		StaticNonStaticDemo ob= new StaticNonStaticDemo();
 		ob.sayHello();
 		System.out.println(ob.nonStaticVar);
 		
 		sayHi();// limited approach
 		StaticNonStaticDemo.sayHi();//best approach
 		System.out.println(staticVar);

	}

}
