package collect;
import java.util.*;
public class CollectionFramework{
public static void main(String[] args) {
//	int arr[]=new int[5];
//	for(int i=0;i<5;i++) {
//		arr[i]=i;
//	}
//	arr[5]=12;a
//	System.out.println(arr[5]);
	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println(list);
	list.add(5);
	System.out.println(list);
ArrayList<String> names=new ArrayList<>();
names.add("Ananya");
names.add("Smriti");
names.add("Jyoti");
names.add("Yashvi");
names.add("Shubham");
System.out.println(names);
System.out.println(names.get(0));
System.out.println(names.get(1));
System.out.println("Size of list: "+names.size());
for(String str: names) {
	System.out.println(str);
}
Iterator<String> itr=names.iterator();
while(itr.hasNext()) {
	String s=itr.next();
	System.out.print(" "+s);
}
ListIterator<String> itr1=names.listIterator();
while(itr.hasNext()) {
	String s=itr.next();
	System.out.print(" "+s);
}
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++");
ArrayList list2=new ArrayList();
list2.add(1);
list2.add("Raj");
System.out.println(list2);




	
	}
}
