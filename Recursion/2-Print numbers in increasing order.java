import java.util.*;
public class Main {
	public static void printInc(int n) {
		if(n==1) {
			System.out.print(1);
			return;
		}
		printInc(n-1);
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printInc(n);
	}
}