
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapExample {
    
    public static void main(String[] args) {
	// LinkedHashMap
	// parameters: int initialCapacity, float loadFactor, boolean accessOrder
	// loadFactor: when map is 75% full, the size will be increased
	// accessOrder could be by the time it is 1. created(default, false) or 2. modified(true)

        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4, 0.75f, true);        
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123); 
        phonebook.put("Gary", 22222); 
        System.out.println("Kevin's number: " + phonebook.get("Kevin"));
               
        System.out.println("\nList of contacts in phonebook:");
        for(Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    
}
