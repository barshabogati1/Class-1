package Day9;

public class IfelseDemo {
public static void main(String[] args) {
	
	/// true cha  bhane arko block run hudaina tei vayera else ko kam
	int a = 14;
	int b=5;
	
	if (a>b){
		System.out.println("a is greater than b.");
		
	}
	if (a<b){
		System.out.println("a is lesserthan b.");///// redundancy hatauna else ako so this if not needed
	}
	else  {
		System.out.println("b is greater than a.");
		
	}
	System.out.println("more code");
	System.out.println("exit");

}
}
