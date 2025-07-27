import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        // list printing

        System.out.println("Initial ArrayList: " + list);

        //list add
  
        list.add(1,15); 
        System.out.println("ArrayList after adding 15 at index 1: " + list);

        //index get
        
        System.out.println("elemnet at index 2: " + list.get(2));

        //replace element
        
        list.set(2, 2);
        System.out.println("after replacing element at index 0 with 5"+ list);

        //remove element

        list.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + list);

        //remove by value

        list.remove(Integer.valueOf(10)); // This will remove the first occurrence of 10
        System.out.println("ArrayList after removing element 10: " + list);

        //contains
     
        System.out.println("contains 20: " + list.contains(20));

        //size

        System.out.println("Size of ArrayList: " + list.size());

        //isEmpty

        System.out.println("Is ArrayList empty? " + list.isEmpty());

        //iterate using for loop

        System.out.println("using iterator :");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");

        }
        System.out.println();

        //sublist
        ArrayList<Integer> sublist = new ArrayList<>(list.subList(0, 2));
        System.out.println("Sublist from index 0 to 2: " + sublist);
        
        //toarray
        Object[] array = list.toArray();
        System.out.println("Array from ArrayList: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }

        // clear
        list.clear();   
        System.out.println("\nArrayList after clearing: " + list);




        
    }
}
