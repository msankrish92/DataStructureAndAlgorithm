package hashTable;

import hashTable.Employee;

public class Main {

	public static void main(String[] args) {
		Employee em1 = new Employee("Sanjay", "Krishnan", 101);
		Employee em2 = new Employee("Ravi", "m", 102);
		Employee em3 = new Employee("Devi", "Khan", 103);
		Employee em4 = new Employee("Rahul", "Krishnan", 104);
		
		SimpleHashTable ht = new SimpleHashTable();
		
		ht.put("Sanjay", em1);
		ht.put("Ravi", em2);
		ht.put("Rahul", em4);
		ht.put("Devi", em3);
//		ht.put("Devi", em3);
		System.out.println("=============PRINT============");
		ht.printHashTable();
		System.out.println("===========GET============");
		System.out.println(ht.get("Devi"));
		System.out.println("===========REMOVE============");
		System.out.println(ht.remove("Rahul"));
		System.out.println(ht.remove("Sanjay"));
		System.out.println("=============PRINT============");
		ht.printHashTable();
		System.out.println("===========GET============");
		System.out.println(ht.get("Devi"));
		System.out.println("=============PRINT============");
		ht.printHashTable();
	
	}
	
}
