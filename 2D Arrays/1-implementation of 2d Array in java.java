import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int n=arr.length;
		int m=arr[0].length; //by arr[0] we will get the first row which is the 0th index row and then we
		// will find its length and we will get the number of coloumns
		
		Scanner sc=new Scanner(System.in);
		System.out.println("kindly enter "+n+" rows and "+m+" colloumns");
		
		//loop to get input from the user
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//loop to print the 2d array
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
