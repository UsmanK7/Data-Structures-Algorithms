import java.util.*;
public class Stack {
	static class Node{
		int data;
		Node next;
		Node(int data) {
			this.data=data;
			this.next=next;
		}
	}
	static class StackB{
		public static Node head=null;
	
		public static boolean isEmpty() {
			return head==null;
		}
		public static void push(int data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		public static int pop() {
			if (isEmpty()){
				return -1;
			}
			Node top=head;
			head=head.next;
			return top.data;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			Node top=head;
			return top.data;
		}
	}
	
	public static void main(String[] args) {
		StackB stack=new StackB();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		while(!stack.isEmpty()) {
			System.out.println(stack.head.data);
			stack.pop();
		}
	}
}
