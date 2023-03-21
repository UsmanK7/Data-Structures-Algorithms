import java.util.*;
public class Main {
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		int f1=fib(n-1);
		int f2=fib(n-2);
		int fn=f1+f2;
		return fn;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n)); 
	}
}