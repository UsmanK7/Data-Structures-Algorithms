import java.util.*;
	public class Main {
		public static String searchSorted(int arr[][],int key) {
			int n=arr.length-1;
			int m=arr[0].length-1;
			for(int row=0;row<=n;row++) {
			int start=0,end=m;
			while(start<=end) {
				int mid=(start+end)/2;
				if(arr[row][mid]==key) {
					String s ="("+row+" , "+mid+")";
					return s;
				}
				if(arr[row][mid]>key) {
					 end=mid-1;
				}
				if(arr[row][mid]<key) {
					start=mid+1;
				}
				}
			
			}
			return "nowhere";
		}
	public static void main(String[] args) {
		int arr[][]= {
				{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
		};
		System.out.println("found at : "+searchSorted(arr,33)); 
	}	
}
	

