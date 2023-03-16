import java.util.*;
public class Main {
	public static boolean palindrome(String str3) {
		for(int i=0;i<str3.length()/2;i++) {
			if(str3.charAt(i)!=str3.charAt(str3.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str3="noon";
		System.out.println(palindrome(str3));
	}
}