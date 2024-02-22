package string;
import java.util.Arrays;
public class StringToCharArray {

	public static void main(String[] args) {
		String str = "hello";
		char[] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
