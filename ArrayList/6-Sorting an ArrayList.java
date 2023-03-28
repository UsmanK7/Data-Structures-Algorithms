import java.util.*;
public class Main {
	public static void printArr(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(1);
		printArr(list);
		Collections.sort(list);
		printArr(list);
		//to print in the decreasing order
		Collections.sort(list,Collections.reverseOrder());
		printArr(list);
	}
}
