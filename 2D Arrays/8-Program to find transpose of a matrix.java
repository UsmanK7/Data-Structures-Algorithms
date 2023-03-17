import java.util.*;
	public class Main {
		public static void print(int arr[][]) {
			System.out.println("the matrix is:");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
			
	public static void main(String[] args) {
		int rows=2,cols=3;
		int arr[][]= {
				{4,7,8},
				{8,8,7},
		};
		
		print(arr);
		int trans[][]=new int[cols][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				trans[j][i]=arr[i][j];
			}
		}
		print(trans);
	}	
}
	

