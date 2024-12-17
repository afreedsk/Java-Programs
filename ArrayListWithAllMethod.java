import java.util.ArrayList;

public class ArrayListWithAllMethod 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list);

        // Add element at a specific index
        list.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + list);

        // Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // Updating elements
        list.set(2, "Orange");
        System.out.println("After updating index 2 to 'Orange': " + list);

        // Removing elements
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);

        // Checking if an element exists
        System.out.println("Contains 'Mango': " + list.contains("Mango"));
        System.out.println("Contains 'Banana': " + list.contains("Banana"));

        // Finding the index of an element
        list.add("Apple");
        System.out.println("Index of 'Apple': " + list.indexOf("Apple"));
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // Checking the size of the ArrayList
        System.out.println("Size of the list: " + list.size());

        // Iterating over the list
        System.out.println("Iterating using for-each loop:");
        for (String item : list) 
        {
            System.out.println(item);
        }

        System.out.println("Iterating using for loop:");
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.println(list.get(i));
        }

        // Sorting the ArrayList
        list.sort(String::compareTo);
        System.out.println("Sorted List: " + list);

        // Clearing the ArrayList
        list.clear();
        System.out.println("After clearing the list: " + list);

        // Checking if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}


/*
 * Explanation of Methods Used:
1.add(E element): Adds an element to the list.
2.add(int index, E element): Adds an element at a specific index.
3.get(int index): Retrieves the element at the specified index.
4.set(int index, E element): Updates the element at a specified index.
5.remove(Object o): Removes the first occurrence of the specified element.
6.remove(int index): Removes the element at the specified index.
6.contains(Object o): Checks if the list contains the specified element.
7.indexOf(Object o): Returns the index of the first occurrence of the element.
8.lastIndexOf(Object o): Returns the index of the last occurrence of the element.
9.size(): Returns the number of elements in the list.
10.sort(Comparator<? super E> c): Sorts the list.
11.clear(): Removes all elements from the list.
12.isEmpty(): Checks if the list is empty.
 */


 /* OUTPUT 
Initial List: [Apple, Banana, Cherry]
After adding 'Mango' at index 1: [Apple, Mango, Banana, Cherry]
Element at index 2: Banana
After updating index 2 to 'Orange': [Apple, Mango, Orange, Cherry]
After removing 'Banana': [Apple, Mango, Orange, Cherry]
After removing element at index 0: [Mango, Orange, Cherry]
Contains 'Mango': true
Contains 'Banana': false
Index of 'Apple': -1
Last index of 'Apple': -1
Size of the list: 3
Iterating using for-each loop:
Mango
Orange
Cherry
Iterating using for loop:
Mango
Orange
Cherry
Sorted List: [Cherry, Mango, Orange]
After clearing the list: []
Is the list empty? true
 */