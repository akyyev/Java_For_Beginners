package Beginner.day65_MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double>  employees = new HashMap<>();
		
		// put(): adds keys and value
		employees.put("Carol" , 200000.99 );
		employees.put("Alla", 120000.89);
		employees.put("Mary", 500000.9876);
		
		System.out.println(employees);
		
		double salary1 = employees.get("Carol");
		System.out.println(salary1);
		
		System.out.println( employees.get("Mary") );
		System.out.println(employees.get("John"));
		
		employees.remove("Carol");
		System.out.println( employees );
		
		System.out.println(employees.size());
		
		
		boolean a = employees.containsKey("Danya");
		System.out.println(a); // the key "Danya" is not exist in the map
		
		
		boolean b = employees.containsValue(100000.99);
		System.out.println(b);
		
		Set<String>  set =  employees.keySet();
		System.out.println(set);
		
		
		Map<String, Integer> map1 = new LinkedHashMap<>();
			map1.put("A", 100);
			map1.put("A", 10);
			map1.put("A", 9);
			map1.put("A", 8);
			
			System.out.println(map1);
			
			map1.put("B",8);
			map1.put(null, null);
			System.out.println(map1);
			
			
	Hashtable<String, Integer> map2 = new Hashtable<>();
	//map2.put("A", null);
	System.out.println(map2);
	
	
	TreeMap<String, Integer> map3 = new TreeMap<>();
	map3.put("Z", 1000);
	map3.put("Y", 9000000);
	map3.put("X", 1000000);
	
	System.out.println(map3);
			
		
		
		
	}

}
