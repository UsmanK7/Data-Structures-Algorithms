import java.util.*;
	public class Main {
		public static void diagonalSum(int arr[][]) {
			int n=arr.length-1; //rows
			int m=arr[0].length-1; //coloumns
			int i=0,j=0;
			int sum=0;
			while(i<=n && j<=m) {
				sum+=arr[i][j];
				i++;
				j++;
			}
			System.out.println("secondary diagonal sum = "+sum);
			int sum2=0;
			while(0<=n && 0<=m) {
				sum2+=arr[n][m];
				n--;
				m--;
			}
			System.out.println("secondary diagonal sum = "+sum2);
	}
	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		diagonalSum(arr);
	}	
}
	

