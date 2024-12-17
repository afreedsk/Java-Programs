import java.util.LinkedList;

public class LinkedListAllMethods
{
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list);

        // Add element at a specific index
        list.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + list);

        // Add elements at the beginning and end
        list.addFirst("Pineapple");
        list.addLast("Grapes");
        System.out.println("After adding 'Pineapple' at the start and 'Grapes' at the end: " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Updating elements
        list.set(2, "Orange");
        System.out.println("After updating index 2 to 'Orange': " + list);

        // Removing elements
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);
        list.remove(0); // Remove first element
        System.out.println("After removing the first element: " + list);
        list.removeLast(); // Remove last element
        System.out.println("After removing the last element: " + list);

        // Checking if an element exists
        System.out.println("Contains 'Mango': " + list.contains("Mango"));
        System.out.println("Contains 'Banana': " + list.contains("Banana"));

        // Finding the index of an element
        list.add("Apple");
        System.out.println("Index of 'Apple': " + list.indexOf("Apple"));
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // Checking the size of the LinkedList
        System.out.println("Size of the list: " + list.size());

        // Iterating over the list
        System.out.println("Iterating using for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("Iterating using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Sorting the LinkedList
        list.sort(String::compareTo);
        System.out.println("Sorted List: " + list);

        // Clearing the LinkedList
        list.clear();
        System.out.println("After clearing the list: " + list);

        // Checking if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
