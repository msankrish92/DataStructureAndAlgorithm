package hashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import hashTable.Employee;

public class Main3 {

	public static void main(String[] args) {
		Employee em1 = new Employee("Sanjay", "Krishnan", 101);
		Employee em2 = new Employee("Ravi", "m", 102);
		Employee em3 = new Employee("Devi", "Khan", 103);
		Employee em4 = new Employee("Rahul", "Krishnan", 104);
		Employee em5 = new Employee("Karthi", "Krishnan", 105);
		
		Map<String, Employee> ht = new HashMap<String, Employee>();
		
		ht.put("Sanjay", em1);
		ht.put("Ravi", em2);
		ht.put("Rahul", em4);
		ht.put("Devi", em3);
//		ht.put("Devi", em5);
		System.out.println("=============PRINT============");
		Iterator<Employee> iterator = ht.values().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("===========GET============");
		System.out.println(ht.get("Devi"));
		System.out.println("===========REMOVE============");
		System.out.println(ht.remove("Rahul"));
		System.out.println(ht.remove("Sanjay"));
		System.out.println("=============PRINT============");
		Iterator<Employee> iterator1 = ht.values().iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("===========GET============");
		System.out.println(ht.get("Devi"));
		System.out.println("=============PRINT============");
//		Iterator<Employee> iterator2 = ht.values().iterator();
		ht.forEach((k,v)->System.out.println(k + " -> " + v));
		System.out.println("=============CONTAINSKEY============");
		System.out.println(ht.containsKey("Devi"));
		System.out.println("=============CONTAINSVALUE============");
		System.out.println(ht.containsValue(em3));
		System.out.println("=============REPLACE============");
		Employee out = ht.put("Devi", em5);
		System.out.println(out);
		ht.forEach((k,v)->System.out.println(k + " -> " + v));
		System.out.println("=============PUTIFABSENT============");
		Employee out2 = ht.putIfAbsent("Devi", em3);
		System.out.println(out2);
		ht.forEach((k,v)->System.out.println(k + " -> " + v));
	
	
	}
	
}
