import java.util.*;
public class vectors {
    public static void main(String[] args) {
        // Create a new Vector
        Vector<String> vector = new Vector<>();
        
        // Add elements to the Vector
        vector.add("apple");
        vector.add("banana");
        vector.add("cherry");
        
        // Print the initial Vector
        System.out.println("Initial Vector: " + vector);
        
        // Add an element at a specific index
        vector.add(1, "orange");
        System.out.println("Vector after adding orange at index 1: " + vector);
        
        // Get an element at a specific index
        System.out.println("Element at index 2: " + vector.get(2));
        
        // Replace an element at a specific index
        vector.set(2, "bongu");
        System.out.println("After replacing element at index 2 with bongu: " + vector);
        
        // Remove an element by index
        vector.remove(3);
        System.out.println("Vector after removing element at index 3: " + vector);
        
        // Remove an element by value
        vector.remove("apple");
        System.out.println("Vector after removing element apple: " + vector);
        
        // Check if the Vector contains a specific value
        System.out.println("Contains banana: " + vector.contains("banana"));
        
        // Get the size of the Vector
        System.out.println("Size of Vector: " + vector.size());
        
        // Check if the Vector is empty
        System.out.println("Is Vector empty? " + vector.isEmpty());
        
        // Iterate through the Vector using an iterator
        System.out.println("Using iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
    
}
