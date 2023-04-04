package company;
public class QueueB {
	//we make a static class so we can use it in main function
	static class Queue{
		//variables are static so they can be used in static methods
		static int arr[];	
		static int size;
		static int rear;
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1;
		}
		public static boolean isEmpty() {
			return rear==-1;
		}
		public static void add(int data) {
		//if our rear is at last index it means our queue is full 
			if(rear==size-1) {
				System.out.println("Queue is full");
				return;
			}
			rear=rear+1;
			arr[rear]=data;
			return;
		}
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is full");
				return -1;
			}
			int front =arr[0];
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
			rear=rear-1;
			return front;
		}
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty yo");
				return -1;
			}
			return arr[0];
		}
	}
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
		System.out.println(q.peek());
		q.remove();
		}
	}
}
