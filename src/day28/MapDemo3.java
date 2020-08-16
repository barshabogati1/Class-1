package day28;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
	public static void main(String[] args) {
		Map<Integer, String> studentMap1 = new HashMap<Integer, String>();
		studentMap1.put(100, "ram");
		studentMap1.put(400, "gopal");
		studentMap1.put(200, "shyam");
		studentMap1.put(300, "hari");
		System.out.println("Using hashmap: ");
		
		for (Map.Entry<Integer, String> student : studentMap1.entrySet()) {
			System.out.println(student.getKey() + " " + student.getValue());
//prints Random
		}
		System.out.println();
		Map<Integer, String> studentMap2 = new LinkedHashMap<>();
		studentMap2.put(100, "ram");
		studentMap2.put(400, "gopal");
		studentMap2.put(200, "shyam");
		studentMap2.put(300, "hari");
		System.out.println("Using linked hashmap: ");
		for (Map.Entry<Integer, String> student : studentMap2.entrySet()) {
			System.out.println(student.getKey() + " " + student.getValue());
	//Prints Insertion Order
		}
		System.out.println();
		System.out.println();
		Map<Integer, String> studentMap3 = new TreeMap<>();
		studentMap3.put(100, "ram");
		studentMap3.put(400, "gopal");
		studentMap3.put(200, "shyam");
		studentMap3.put(300, "hari");
		System.out.println("Using tree map: ");
		for (Map.Entry<Integer, String> student : studentMap3.entrySet()) {
			System.out.println(student.getKey() + " " + student.getValue());
		//Prints in order 
		}
}
}
