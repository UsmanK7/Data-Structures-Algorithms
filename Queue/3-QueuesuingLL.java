package company;
public class QueueB {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	static class Queue{
		static Node head=null;
		static Node tail=null;
		//we will not create isFull() function because we can add 
		//as many elements as we want in LinkedList and it doesnot
		//has a fixed size like array
		public static boolean isEmpty() {
			return head==null && tail==null;
		}
		public static void add(int data) {
			Node newNode=new Node(data);
			if(isEmpty()) {
				head=tail=newNode;
			}
			tail.next=newNode;
			tail=newNode;
		}
		public static int remove() {
			if(isEmpty()) {
				System.out.println("the Queue is empty Nothing to remove");
				return -1;
			}
			int front=head.data;
			if(tail==head) {
				tail=head=null;
			}
			else {
				head=head.next;
			}
			return front;
		}
		public static int peek() {
			if(isEmpty()) {
				System.out.println("the Queue is empty");
				return -1;
			}
			int front=head.data;
			return front;
		}
		
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.remove();
		
		while(!q.isEmpty()) {
			System.out.println(q.peek()+" ");
			q.remove();
		}
	}
}
