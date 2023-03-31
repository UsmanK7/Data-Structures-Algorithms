import java.util.ArrayList;
public class Stack {
	static class StackB{
		static ArrayList <Integer> list=new ArrayList<>();
		public static void push(int data) {
			list.add(data);
		}
		public static boolean isEmpty() {
			return list.size() ==0;
		}
		public static int pop() {
			int top=list.get(list.size()-1);
				list.remove(list.size()-1);
				return top;
		}
		public static int peek() {
			return list.get(list.size()-1);
		}
	}
	
	public static void main(String[] args) {
		StackB stack=new StackB();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		while(!stack.isEmpty()) {
			System.out.println(stack.peek()); 
			stack.pop();
		}
	}
}
