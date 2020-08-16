package day18;

public class Triangle extends Shape {
	@Override  //
	public void draw() {
		System.out.println("Triangle  is drawn.");

	}
	
	public Triangle () {
		System.out.println("triangle default constructor called.");
	}
}
//1. must override abstract method
//2.cannot create object but we can create reference variable
//3.if child do not want to override this class should be abstract as well.
//4. abstact goes before class and method only
//abstract class ma abstract / non- abstract method dubai banauna milcha
//abstarct ma private nope only public or protected// no final as final cannot be extended
//no static too coz static method and private method cannnot be override