package sorting;

import java.util.*;

// Custom Comparator for Strings
class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // Reverse lexicographical order
        return s2.compareTo(s1);
    }
}
class StringComparator2 implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2) {
        	return 1 ;
        }else if(len1<len2) {
        	return -1;
        }else {
        	return 0;
        }
        
        
    }
}

public class stringlist {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Applee");
        names.add("Mango");
        names.add("Bananaaaa");
        names.add("Orangee");
        names.add("Grapesss");

        // Default sort (A → Z)
        Collections.sort(names);
        System.out.println("Default sort (A → Z): " + names);

        // Custom sort (Z → A)
        Collections.sort(names, new StringComparator());
        System.out.println("Custom sort (Z → A): " + names);
        Collections.sort(names, new StringComparator2());
        System.out.println("With respective to their length: " + names);
    }
}
