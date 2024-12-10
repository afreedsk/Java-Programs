import java.util.LinkedList;
class LinkedListDemo1
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println("LinkedList 1: " + l1);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        System.out.println("LinkedList 2: " + l2);
        LinkedList<Integer> l3 = new LinkedList<>(l1);
        l3.addAll(l2); 
        System.out.println("Concatenated LinkedList: " + l3);
    }
}
