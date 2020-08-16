package day28;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
public static void main(String[] args) {
   Map<Integer, String> studentMap = new HashMap<Integer, String>();
   studentMap.put(100, "ram");
   studentMap.put(200, "shyam");
   studentMap.put(300, "hari");
   System.out.println(studentMap);
   System.out.println(studentMap.get(100));
   System.out.println(studentMap.get(200));
   System.out.println(studentMap.get(300));
   
   System.out.println(studentMap.containsKey(201));
   System.out.println(studentMap.containsValue("hari"));
   
  // studentMap.clear();
   System.out.println(studentMap);
   System.out.println(studentMap.isEmpty());
   System.out.println(studentMap.size());
   System.out.println(studentMap.remove(100));
   System.out.println(studentMap);
   Collection<String> c = studentMap.values();
   System.out.println(c);
   System.out.println(studentMap.values());
   
   
   
   }
}
