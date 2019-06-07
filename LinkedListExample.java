import java.util.LinkedList;


public class LinkedListExample {
    
    
    public static void main(String[] args) {
        // LinkedList does these operations faster than arraylist: add/remove from the middle of the list
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
        
    }

    
}
