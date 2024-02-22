package string;

public class AddIndividualDigits {

	public static void main(String[] args) {
		String str = "j1a2v3a";
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				int digit = ch - 48;
				sum+=digit;
			}
		}
		System.out.println(sum);
	}

}
