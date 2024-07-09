package string;

public class DistinctElements {

	public static void main(String[] args) {
		String str = "alphaadida";
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			int index = str1.indexOf(str.charAt(i));
			if(index == -1) {
				str1 += str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
