package string;

public class CountStringOccurence {

	public static void main(String[] args) {
		String str = "this is a class and this is a programming class";
		String s2 = "is";
		int count = 0;
		int l = s2.length();
		int index = 0;
		while(str.indexOf(s2, index) != -1) {
			count++;
			index = str.indexOf(s2, index) + l;
		}
		System.out.println(count);
	}

}
