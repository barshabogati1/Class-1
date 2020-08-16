package Day6;

public class OperatorsDemo3 {
public static void main(String[] args) {
	
	//Increment/ decrement Operator
	//++ --
	//Post a++ a-- ( operation huncha ani incremnet)
	//pre ++a --a ( increment huncha ani operation)
	int a=5;
	System.out.println(a);
	a=a+1;
	System.out.println(a);
	a+=1;
	a++;// (1 matra le badhaunu cha bhane)
	System.out.println(a);
	--a;	
	System.out.println(a);
    //Exmaple
	int x=4;
	System.out.println(x); //4
	System.out.println(x++); //4
	System.out.println(x); //5
	
	int m=5;
	int n=m++;
	System.out.println(m);//6
	System.out.println(n);//5
	
	int i=5;
	i=(i++)+(++i)+i+1;//5+7+7+1
	System.out.println(i);//
}
}