package arraylist;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding values
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList after adding: " + list);

        // Retrieving value
        int index = 1;
        System.out.println("Element at index " + index + " is: " + list.get(index));

        // Removing value
        list.remove(index);
        System.out.println("ArrayList after removing element at index " + index + ": " + list);
    }
}
