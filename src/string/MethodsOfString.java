package string;

import java.util.Arrays;

public class MethodsOfString {

	public static void main(String[] args) {
		String str = "helloh";
		String str1 = "Hello how are you";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.concat(" how are you"));
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf("ll", 3));
		System.out.println(str.indexOf("llo"));
		System.out.println(str);
		System.out.println(str.indexOf("llo", 3));
		String[] arg = str1.split(" ");
		System.out.println(Arrays.toString(arg));
		String str2 = "developer";
		System.out.println(str2.substring(4)); //loper
		System.out.println(str2.substring(3,5)); //el final index is excluded
		System.out.println(str2.substring(5,9 ));
		
	}

}
