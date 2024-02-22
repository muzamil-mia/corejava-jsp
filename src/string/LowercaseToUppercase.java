package string;

public class LowercaseToUppercase {

	public static void main(String[] args) {
		String str = "hello";
		
		//String str1 = str.toUpperCase();
		//System.out.println(str1);
		
		String str2 = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				str2 = str2 + (char) (ch - 'a' + 'A');
			}
		}
		System.out.println(str2);
	}

}
