package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai2 {
	public static void main(String[] args) {
		String str = "@adb@cio@yuo@nhd@adb@nhd@mnv@cio@adb@";
		
		byte count = 0;
		for (int i = 0; i<str.length(); i++) {
			if (str.charAt(i) == '@') {
				str = str.replace(str.charAt(i), ' ');
				count++;
			}
		}
		
		str = str.trim();
		
		String s[] = new String[count-1];
		String s1 = "";
		int i = 0;
		
		s = str.split(" ");
		for (String a : s) {
			s1+=a;
			i++;
			a = a.replaceAll(a, " ");
			s1+=" ";
		}  
		
		System.out.println(s1);
		
		
		
		
		System.out.println(str);
	}
}
