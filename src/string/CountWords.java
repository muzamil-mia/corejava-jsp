package string;

public class CountWords {

	public static void main(String[] args) {
		String str = "hello how are you";
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
