package sorting;
import java.util.*;
class student implements Comparable<student> {
    String name;
    int rollno;

    student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return name + " " + rollno;
    }

    @Override
    public int compareTo(student that) {
        // Sort by name (lexicographically A → Z)
        //return this.name.compareTo(s.name);
    	return this.rollno - that.rollno;
    }
}
public class start {
public static void main(String[] args) {
	List<student> list=new ArrayList<>();
	list.add(new student("Gavendra",111));
	list.add(new student("Brajesh",90));
	list.add(new student("Harsh",113));
	list.add(new student("Lucifer",0));
	list.add(new student("Kushal",144));
	System.out.println("Before comparing :"+list);
	Collections.sort(list);
	System.out.println("After Sorting on the basis of roll no :"+list);

}
}
