import java.util.*;
	public class Main {
		public static boolean staircaseSearch(int arr[][],int key) {
			int rows=0;
			int col=arr[0].length-1;
			
			while(rows<=arr.length && col>=0) {
				if(arr[rows][col]==key) {
					System.out.println("element found at : ( "+rows+","+col+" ) ");
					return true;
				}
				else if(arr[rows][col]>key) {
					col--;
				}
				else {
					rows++;
				}
			}
			System.out.println("not found");
			return false;
		}
	public static void main(String[] args) {
		int arr[][]= {
				{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
		};
		staircaseSearch(arr,32);
	}	
}
	

