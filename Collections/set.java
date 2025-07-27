public class set {
    public static void main(String[] args) {
        // Create a new HashSet
        java.util.HashSet<String> set = new java.util.HashSet<>();
        
        // Add elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        
        // Print the initial HashSet
        System.out.println("Initial HashSet: " + set);
        
        // Check if the HashSet contains a specific value
        System.out.println("Contains banana: " + set.contains("banana"));
        
        // Remove an element by value
        set.remove("apple");
        System.out.println("HashSet after removing apple: " + set);
        
        // Get the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());
        
        // Check if the HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());
        
        // Iterate through the HashSet using an iterator
        System.out.println("Using iterator:");
        java.util.Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

            //to array
            Object[] array = set.toArray();

            System.out.println("\nHashSet to Array: " + java.util.Arrays.toString(array));
            
        }
    }
}
