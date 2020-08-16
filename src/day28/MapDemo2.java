 package day28;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
//Iterrate
	public static void main(String[] args) {
		   Map<Integer, String> studentMap = new HashMap<Integer, String>();
		   studentMap.put(100, "ram");
		   studentMap.put(200, "shyam");
		   studentMap.put(300, "hari");
		  // for (int i =0; i< studentMap.size();i++) {
			//   System.out.println(studentMap.get(i));
		   
		  // }
	for (Map.Entry<Integer, String> student: studentMap.entrySet()) {
		System.out.println(student.getKey()+" "+student.getValue());
		
	}
}
}
