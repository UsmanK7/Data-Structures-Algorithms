import java.util.*;
	public class Main {
		public static int ques(int arr[][]) {
			int rows=1;
			int sum=0;
			for(int col=0;col<=arr[0].length-1;col++) {
				sum+=arr[rows][col];
			}
			return sum;
		}
	public static void main(String[] args) {
		int arr[][]= {
				{1,4,9},
				{11,4,3},
				{2,2,3}
		};
		System.out.println(ques(arr));
	}	
}
	

