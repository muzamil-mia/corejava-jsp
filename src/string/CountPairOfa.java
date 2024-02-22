package string;

public class CountPairOfa {

	public static void main(String[] args) {
		String str = "abaabaaaacdefahaad";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' && str.charAt(i+1) =='a') {
				count++;
				i++;
			}
		}
		System.out.println(count);
	}

}
