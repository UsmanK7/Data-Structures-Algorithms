import java.util.*;
public class Main {
	public static void substring(String str,int si,int ei) {
		String str2="";
		for(int i=si;i<=ei;i++) {
			str2+=str.charAt(i);
		}
		System.out.println(str2);
	}
	public static void main(String[] args) {
			String str="Hello World";
			substring(str,0,3);
			
	}
}