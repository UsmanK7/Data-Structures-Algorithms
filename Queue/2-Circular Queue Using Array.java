package company;
public class QueueB {
	static int arr[];
	static int size;
	static int rear;
	static int front;
	QueueB(int n){
		arr=new int[n];
		size=n;
		rear=-1;
		front=-1;
	}
	
	public static boolean isEmpty() {
		return rear==-1 && front==-1;
	}
	public static boolean isFull() {
		return (rear+1)%size==front;
	}
	public static void add(int data) {
		if(isFull()) {
			System.out.println("the Queue is full yo");
			return;
		}
		//if we are adding first element in circular queue
		if(front==-1) {
			front=0;
		}
		rear=(rear+1)%size;
		arr[rear]=data;
	}
	public static int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty yo!");
			return -1;
		}
		int result=arr[front];
		//if we are deleting the last element and the rest is empty
		if(rear==front) {
			rear=front=-1;
		}
		//if we have some some elements remaining
		else {
		front=(front+1)%size;
		}
		return front;
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty nothing to print");
			return -1;
		}
		return arr[front];
	}
	public static void main(String[] args) {
		QueueB q=new QueueB(5);
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.remove());
		q.add(4);
		System.out.println(q.remove());
		q.add(5);
		while(!isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}
}
