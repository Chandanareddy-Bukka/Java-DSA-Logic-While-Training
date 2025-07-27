
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        //create a new HashMap
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        //put(key, value) pairs into the HashMap
        map.put("apple", 1);        
        map.put("banana", 2);
        map.put("cherry", 3);
        System.out.println("Initial HashMap: " + map);

        //putAll(Map m) 
        Map<String, Integer> anotherMap = new java.util.HashMap<>();
        anotherMap.put("date", 4);
        anotherMap.put("elderberry", 5);
        map.putAll(anotherMap);
        System.out.println("HashMap after putAll: " + map);

        //get(Object key)
        System.out.println("Value for key 'banana': " + map.get("banana"));

    }
}
