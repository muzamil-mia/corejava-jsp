package string;

public class CountCharacters {

	public static void main(String[] args) {
		String str = "hello ho5w are yo7u";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) >= '0' && str.charAt(i) <= '9') && (str.charAt(i) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(str.length() - count);
	}

}
