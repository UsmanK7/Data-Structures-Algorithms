import java.util.*;
public class Main {
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			//swap
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {5,7,4,3,2,1};
		printArr(arr);
		System.out.println("selection sort");
		selectionSort(arr);
		printArr(arr);
	}
}