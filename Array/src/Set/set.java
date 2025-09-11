package Set;
import java.util.*;

public class set {
	public static void main(String[] args) {
Set<Integer> st=new HashSet<>();
st.add(1);
st.add(3);
st.add(2);
st.add(4);
st.add(5);
System.out.println("...........HashSet..........");
System.out.println(st);
Set<Integer> st2=new LinkedHashSet<>();
st2.add(1);
st2.add(3);
st2.add(2);
st2.add(5);
st2.add(4);
System.out.println("...........LinkedHashSet..........");
System.out.println(st2);
Set<Integer> st3=new TreeSet<>();
st3.add(1);
st3.add(3);
st3.add(2);
st3.add(5);
st3.add(4);
System.out.println("...........TreeSet..........");
System.out.println(st3);




	}
}
