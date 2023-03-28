import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		//operations
		//add operation O(1)
		list.add(3);
		list.add(2);
		list.add(1);
		//used get operation to print the arraylist
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//remove operation in array list O(1)
		list.remove(1);
		//set element at index
		list.set(1, 3);
		//contains() operation that returns true or false wheteher
		//the element is present or not O(n)
		System.out.println(list.contains(3));
	}
}
