import java.util.*;
	public class Main {
		public static int ques(int arr[][]) {
			int n=arr.length;
			int m=arr[0].length;
			int sum=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i][j]==7) {
						sum++;
					}
				}
			}
			return sum;
		}
	public static void main(String[] args) {
		int arr[][]= {
				{4,7,8},
				{8,8,7},
		};
	System.out.println(ques(arr));
	}	
}
	

