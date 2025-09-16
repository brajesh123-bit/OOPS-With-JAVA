package queue;
import java.util.*;
public class Queues {
	
	    public static void main(String[] args){
	        Queue<Integer> q = new PriorityQueue<>();
	        q.add(22);
	        q.add(21);
	        q.add(2);
	        q.add(32);
	        q.add(42);
	        q.add(52);
	        q.add(87);
	        q.add(4);
	        q.add(11);
	        System.out.println("Priority Queue");
	        System.out.println(q);
	        Queue<Integer> q1 = new LinkedList<>();
	        q1.add(2);
	        q1.add(0);
	        q1.add(3);
	        q1.add(4);
	        q1.add(null);
	        q1.add(39);
	        q1.add(8);
	        q1.add(6);
	        System.out.println("LinkedList");
	        System.out.println(q1);
	        System.out.println(q1.contains(39)); //it checks is this number available
	        q1.addAll(q);
	        System.out.println(q1);
	        System.out.println(q.poll()); //Retrieves and removes the head of this queue, or returns null if this queue is empty
	        System.out.println(q1.peek()); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
	        q.offer(90);
	        q.remove(52);
	        q.remove(22);
	        System.out.println(q);

	        Queue<Integer> q2 = new PriorityQueue<>(Comparator.reverseOrder());
	        q2.add(9);
	        q2.add(8);
	        q2.add(4);
	        q2.add(6);
	        q2.add(1);
	        q2.add(7);
	        System.out.println(q2);
	        for (Integer i:q1){
	            System.out.print(i+" ");
	        }
	        System.out.println();
	        
	        
	        Queue<Integer>q3=new ArrayDeque<>();
	        q3.add(9);
	        q3.add(8);
	        q3.add(4);
	        q3.add(6);
	        q3.add(1);
	        q3.add(7);
	        System.out.println(q3);
	    }
	}

