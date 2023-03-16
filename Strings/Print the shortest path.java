import java.util.*;
import java.math.*;
public class Main {
	public static void route(String str) {
		int x=0;
		int y=0;
		for(int i=0;i<str.length();i++) {
			char str2=str.charAt(i);
			if(str2=='N') {
				y++;
			}
			else if(str2=='S') {
				y--;
			}
			else if(str2=='W') {
				x--;
			}
			else {
				x++;
			}
		}
		System.out.println("final distination is: ("+x+" , "+y+")");
		int x2=x*x;
		int y2=y*y;
		int result=x2+y2;
		int shor=(int)Math.sqrt(result);
		System.out.println("shortest path is :"+shor);
	}
	public static void main(String[] args) {
			String str="WNEENESENNN";
			route(str);
	}
}