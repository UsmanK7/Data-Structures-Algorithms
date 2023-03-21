import java.util.*;
public class Main {
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		int fnm1=sum(n-1);
		int fn=n+fnm1;
		return fn;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n)); 
	}
}  