import java.util.*;
public class StackAL {
	public static String reverseString(String str) {
		Stack <Character>s=new Stack<>();
		int idx=0;
		while(idx<str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		StringBuilder str2=new StringBuilder();
		while(!s.isEmpty()) {
			char top=s.pop();
			str2.append(top);
		}
		return str2.toString();
	}

	public static void main(String[] args) {
		String str="usman";
		System.out.println(reverseString(str));
	}
	}
