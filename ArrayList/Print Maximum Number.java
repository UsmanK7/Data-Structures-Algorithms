import java.util.*;
public class Main {
	public static int FindMax(ArrayList <Integer> list) {
		int minimum=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			int curr=list.get(i);
			if(minimum<curr) {
				minimum=curr;
			}
		}
		return minimum;
	}
	
	public static void printArr(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(9);
		list.add(3);
		printArr(list);
		System.out.println(FindMax(list));
		
	}
}
