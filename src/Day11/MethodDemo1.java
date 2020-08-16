package Day11;

public class MethodDemo1 {
	
	
	//method declaration
	
	public void sayHello() {  // no argument
		System.out.println("Hello from Nepal");
	}
	
	public static void main(String[] args) {// main matra print huncha java ma
		System.out.println("main start");
		//object creation
		MethodDemo1 ob = new MethodDemo1();
		//method calling
		ob.sayHello();
		System.out.println("main end ");
	}

}
