package day12;

public class Student {
	String name;
	int roll;
	
	public void assignInfo(String n ,int r) {
		name= n;
		roll = r;
	}
	public void printInfo() {
		System.out.println(" studnet name is "+ name);
		System.out.println(" studnet roll is "+ roll);
	}
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.assignInfo("santosh", 12);
		student1.printInfo();
		//student1.name="santosh";
		//student1.roll= 12;
		//System.out.println(student1.name);
		//System.out.println(student1.roll);
		
	    Student student2= new Student();
	    student2.assignInfo("barsha", 13);
	    student2.printInfo();
	   // student1.name="barsha"; bad so make method
		//student1.roll= 13; bad so make method
	    //System.out.println(student2.name);// print individual is bad too
		//System.out.println(student2.roll);
	    
	    student2.assignInfo("raju", 14);
	    student2.printInfo();
	    		
	}

}
