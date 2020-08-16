package day12;

public class StaticNonStaticTest {
	String nonStaticVar = " this is non static variable";
	
	static String StaticVar = "This is static variable";
	
	public static void main(String[] args) {
		
		StaticNonStaticDemo ob= new StaticNonStaticDemo();
 		ob.sayHello();
 		System.out.println(ob.nonStaticVar);
 	
 		
 		
 		// sayHi();// limited approach doesnt work here
 		StaticNonStaticDemo.sayHi();//best approach
 		System.out.println(StaticNonStaticDemo.staticVar);
 		
	}

}
