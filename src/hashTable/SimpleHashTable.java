package hashTable;

public class SimpleHashTable {

	private StoredEmployee[] hashTable;

	public SimpleHashTable() {
		hashTable = new StoredEmployee[10];
	}

	public void put(String key, Employee employee) {
		int hashedkey = hashKey(key);
		if (occupied(hashedkey)) {
			int stopIndex = hashedkey;
			if (hashedkey == hashTable.length - 1) {
				hashedkey = 0;
			} else {
				hashedkey++;
			}
			while (occupied(hashedkey) && hashedkey != stopIndex) {
				hashedkey = (hashedkey + 1) % hashTable.length;
			}
		}
		if (occupied(hashedkey)) {
			System.out.println("Sorry! There is already an emplyoee at postion at" + hashedkey);
		} else {
			hashTable[hashedkey] = new StoredEmployee(key, employee);
		}
	}

	public Employee get(String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) {
			return null;
		}

		return hashTable[hashedKey].employee;
	}
	
	public Employee remove(String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) {
			return null;
		}
		Employee employee = hashTable[hashedKey].employee;
		hashTable[hashedKey] = null;
		StoredEmployee[] oldHashTable = hashTable;
		hashTable = new StoredEmployee[hashTable.length];
		for (int i = 0; i < oldHashTable.length; i++) {
			if(oldHashTable[i] != null) {
				put(oldHashTable[i].key, oldHashTable[i].employee);
			}
		}
		return employee;
	}

	private int hashKey(String key) {
		return key.length() % hashTable.length;
	}

	private int findKey(String key) {
		int hashedKey = hashKey(key);
		if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
			return hashedKey;
		}

		int stopIndex = hashedKey;
		if (hashedKey == hashTable.length - 1) {
			hashedKey = 0;
		} else {
			hashedKey++;
		}
		while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
			hashedKey = (hashedKey + 1) % hashTable.length;
		}
//		if (stopIndex == hashedKey) {
//			return -1;
//		} else {
//			return hashedKey;
//		}
		
		if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
			return hashedKey;
		}else {
			return -1;
		}
		
	}
	

	private boolean occupied(int index) {
		return hashTable[index] != null;
	}

	public void printHashTable() {
		for (int i = 0; i < hashTable.length; i++) {
			if(hashTable[i] == null) {
				System.out.println("Empty");
			}else {
				System.out.println("Position" + i + ": " + hashTable[i].employee);	
			}
			
		}
	}

}
