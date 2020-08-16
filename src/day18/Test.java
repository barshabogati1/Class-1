package day18;

public class Test {
	public static void main(String[] args) {
		//Shape shape = new Shape () ;
		//shape.draw();
		Shape shape;//cannot create object but we can create reference variable
		//Parents ko reference variable am child ko object rakhna milcha **** new garna mildaina
		
		System.out.println("=====================");
		
	shape = new Triangle();
		shape. draw();
	System.out.println("=====================");
		
		shape = new Circle();
		shape. draw();
			
			
		}
	}


