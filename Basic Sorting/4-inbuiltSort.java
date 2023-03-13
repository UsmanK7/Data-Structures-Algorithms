import java.util.*;
public class Main {
	public static void printArr(Integer arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer arr[]= {5,4,1,3,2};
		System.out.println("actual array");
		printArr(arr);
		Arrays.sort(arr);
		System.out.println("Sorted array");
		printArr(arr);
		System.out.println("array in reverse order");
		Arrays.sort(arr,Collections.reverseOrder());	
		printArr(arr);
		//from 0 to 3 index
		
		Arrays.sort(arr,0,3);
		printArr(arr);
		Arrays.sort(arr,0,3,Collections.reverseOrder() );
		printArr(arr);
	}
}