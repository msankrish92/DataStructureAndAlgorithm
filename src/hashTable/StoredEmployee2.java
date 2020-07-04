package hashTable;

public class StoredEmployee2 {

	public String key;
	public Employee employee;

	public StoredEmployee2(String key, Employee employee) {

		this.key = key;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "StoredEmployee [key=" + key + ", employee=" + employee + "]";
	}

}
