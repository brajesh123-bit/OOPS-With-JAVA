package sorting;

import java.util.*;
class A implements Comparator<Integer>{
	@Override
	public int compare(Integer i, Integer j) {
		if(i<j) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class list {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(26);
	list.add(29);
	list.add(28);
	list.add(17);
	list.add(25);
	list.add(31);
	Collections.sort(list);
	System.out.println(list);
	Collections.sort(list,new A());
	System.out.println(list);

	
}
}

