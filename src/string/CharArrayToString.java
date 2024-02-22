package string;

public class CharArrayToString {

	public static void main(String[] args) {
		char[] arr = {'h','e','l','l','o'};
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str = str + arr[i];
		}
		System.out.println(str);
	}

}
