package string;

public class CountDigits {

	public static void main(String[] args) {
		String str = "hello how12 are123";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) > '0' && str.charAt(i) < '9') {
				count++;
			}
		}
		System.out.println(count);
	}

}
