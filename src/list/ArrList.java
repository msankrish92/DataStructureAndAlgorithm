package list;

import java.util.ArrayList;
import java.util.List;

public class ArrList {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("Sanjay", "Krishnan", 101));
		empList.add(new Employee("Ravi", "m", 101));
		empList.add(new Employee("Dev", "Khan", 101));
		empList.add(new Employee("Rahul", "Krishnan", 101));
		
		empList.forEach(employee -> System.out.println(employee));
		System.out.println(empList.contains(new Employee("Ravi", "m", 101)));
		
	}
	
	
}
