package day12;

public class Employee {
	String empName;
	int empAge;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	public Employee(String name) {
		empName = name;
		System.out.println("Argument Constructor");
	}
	public Employee(int age) {
		empAge = age;
		System.out.println("Argument Constructor");
	}
	public Employee(String name, int age) {
		empName= name;
		empAge = age;
		System.out.println("Argument Constructor");
	}
	public Employee(int age, String name) {
		empName= name;
		empAge = age;
		System.out.println("Argument Constructor");
	}
public static void main(String[] args) {
	Employee e1 = new Employee();
	Employee e1 = new Employee(11, "ram");
	
	
	
}
}
