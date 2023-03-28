import java.util.*;
public class Main {
	public static void swapElements(ArrayList<Integer> list,int e1,int e2) {
		int temp=list.get(e1);
		list.set(e1, e2);
		list.set(e2, temp);
	}
	
	public static void printArr(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		printArr(list);
		swapElements(list,2,3);
		printArr(list);
	}
}
