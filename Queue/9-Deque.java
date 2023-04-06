	package company;
	import java.util.*;
	public class QueueB {
		
	public static void main(String[] args) {	
		Deque <Integer>q=new LinkedList<>();
		q.addFirst(2);
		q.addFirst(1);
		q.addLast(3);
		q.addLast(4);
		System.out.println(q);
		q.removeLast();
	}
	}
