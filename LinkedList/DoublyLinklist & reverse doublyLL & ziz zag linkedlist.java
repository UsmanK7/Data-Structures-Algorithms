public class LinkedList {
	public static class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addFirst(int data) {
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		
		return;
	}
	public void addSpec(int data,int idx) {
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		for(int i=0;i<idx-1;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		newNode.prev=temp;
	}
	public void addLast(int data) {
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		
		return;
	}
	public int removeFirst() {
		int val=head.data;
		head=head.next;
		head.prev=null;
		size--;
		return val;
	}
	public int removeLast() {
		//to get Node prev to tail
		Node temp=head;
		for(int i=0;i<size-2;i++) {
			temp=temp.next;
		}
		//deletion
		int val=tail.data;
			temp.next=null;
			tail=temp;
			size--;
			return val;
			
	}
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public void zigzag() {
	//find mid
	Node slow=head;
	Node fast=head.next;
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	Node midNode=slow;
	//reverse the linked list
	//to reverse a linked list we create three variables and do 4 steps
	Node curr=midNode.next;
	midNode.next=null;
	Node prev=null;
	Node next;
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
	Node left=head;
	Node right=prev;
	Node nextL,nextR;
	//merge them in zig zag manner
		while(left!=null && right!=null) {
			nextL=left.next;
			left.next=right;
			nextR=right.next;
			right.next=nextL;
			
			left=nextL;
			right=nextR;
		}
	}
	public void reverse() {
		Node curr=head;
		Node prev=null;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	public static void main(String[] args) {
		LinkedList dll=new LinkedList();
		dll.addFirst(3);
		dll.addFirst(2);
		dll.addFirst(1);
		dll.addLast(4);
		dll.addLast(5);
		dll.print();
		dll.addSpec(69, 3);
		dll.print();
		dll.reverse();
		dll.print();
	}
}
