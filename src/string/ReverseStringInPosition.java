package string;

import java.util.Arrays;

public class ReverseStringInPosition {

	public static void main(String[] args) {
		String str = "hello world how are you";
		String newStr = reverse(str);
		System.out.println(newStr);
		System.out.println("Hello World!");
		int[] arr = {1,2,3,4,5};
		int n = 3;
		for(int i = 0; i < n; i++){
			int j, first = arr[0];
			for(j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static String reverse(String str) {
		String[] strArray = str.split(" ");
		String reverse = "";
		for(int i = strArray.length-1; i >= 0; i--) {
			reverse = reverse + strArray[i];
			if(i > 0) {
				reverse = reverse + " ";
			}
		}
		return reverse;
	}

}
