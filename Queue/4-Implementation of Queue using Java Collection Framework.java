package company;
import java.util.*;
public class QueueB {
	public static void main(String[] args) {
		//queue in Java collection framework is interface
		//we cannot make objects of interface so we make 
		//objects of classes that implement interfaces
		//in java two classes LinkedList and ArrayDeque
		//implement Queue
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek()+" ");
			q.remove();
		}
	}
}
