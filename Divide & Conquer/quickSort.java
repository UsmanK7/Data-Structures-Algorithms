import java.util.*;
public class Main {
	public static void quickSort(int arr[],int si,int ei) {
		//base case
		if(si>=ei) {
			return;
		}
		//pivot variable stores correct idx for pivot element
		int Idx=partition(arr,si,ei);
		quickSort(arr,si,Idx-1);
		quickSort(arr,Idx+1,ei);
	}
	public static int partition(int arr[],int si,int ei) {
		int pivot=arr[ei];
		int i=si-1;//make space for elements smaller then pivot
		for(int j=si;j<ei;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//place pivot at correct positon
		i++;
		int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp; //pivot's position need to change so (pivot = temp) won't work
        return i;
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2};
		quickSort(arr,0,arr.length-1);
		printArr(arr);
	}
}
