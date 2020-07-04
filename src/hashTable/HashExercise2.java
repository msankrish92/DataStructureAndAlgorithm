package hashTable;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashExercise2 {

	public static void main(String[] args) {

		List<Employee> list = new LinkedList<>();

		Employee em1 = new Employee("Sanjay", "Krishnan", 101);
		Employee em2 = new Employee("Ravi", "m", 102);
		Employee em3 = new Employee("Devi", "Khan", 103);
		Employee em4 = new Employee("Rahul", "Krishnan", 104);
		Employee em5 = new Employee("Rahul", "Krishnan", 104);
		Employee em6 = new Employee("Devi", "Khan", 103);

		list.add(em1);
		list.add(em2);
		list.add(em3);
		list.add(em4);
		list.add(em5);
		list.add(em6);

		Map<String, Employee> hm = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			hm.put(list.get(i).getFirstName(), list.get(i));
		}

		hm.forEach((k, v) -> System.out.println(k + "->" + v));
		
		list.clear();
		
		hm.forEach((k, v) -> list.add(v));

		System.out.println(list);
	}

}
