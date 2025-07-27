public class mylinkedlist {
    public static void main(String[] args) {
        // Create a new LinkedList
        java.util.LinkedList<String> list = new java.util.LinkedList<>();
        
        // Add elements to the LinkedList
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        
        // Print the initial LinkedList
        System.out.println("Initial LinkedList: " + list);
        
        // Add an element at a specific index
        list.add(1, "orange");
        System.out.println("LinkedList after adding orange at index 1: " + list);
        
        // Get an element at a specific index
        System.out.println("Element at index 2: " + list.get(2));
        
        // Replace an element at a specific index
        list.set(2, "bongu");
        System.out.println("After replacing element at index 2 with 25: " + list);
        
        // Remove an element by index
        list.remove(3);
        System.out.println("LinkedList after removing element at index 3: " + list);
        
        // Remove an element by value
        list.remove(String.valueOf("apple"));
        System.out.println("LinkedList after removing element apple: " + list);
        
        // Check if the LinkedList contains a specific value
        System.out.println("Contains 20: " + list.contains("apple"));
        
        // Get the size of the LinkedList
        System.out.println("Size of LinkedList: " + list.size());
        
        // Check if the LinkedList is empty
        System.out.println("Is LinkedList empty? " + list.isEmpty());
        
        // Iterate through the LinkedList using an iterator
        System.out.println("Using iterator:");
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
