package day17;

public class Parent {
	String name = "Parents's name";// hidden variable so not inherited
	
	public void sayHello () {
		System.out.println("Hello from parent");// overridden method
	}

}
// access hudaina
// private member ( member vaneko class vitra ko non static variable ra method) 
// hidden variable
// overridden method parent ko method override garyoo so inherit hudaina 
// eg.. bank ma open acoount kholda saving / current / diff kholda child le type anusar work garcha
