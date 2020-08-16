package day18;

public abstract class Shape {

	public abstract void draw();
	public void paint() {
		System.out.println("shape is painted. ");
	}
		public Shape () {
			System.out.println(" shape constructor called.");
		}
	}
