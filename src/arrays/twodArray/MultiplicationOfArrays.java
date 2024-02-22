package arrays.twodArray;

import java.util.Arrays;

public class MultiplicationOfArrays {

	public static void main(String[] args) {
		int[][] arr = {{4,5},{5,4}};
		int[][] arr1 = {{2,3},{2,4}};
		int[][] newArr = new int[arr.length][arr[0].length];
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				for(int k = 0; k < newArr[i].length; k++) {
					newArr[i][j] += arr[i][k] * arr1[k][j];
				}
			}
		}
		for(int i = 0; i < newArr.length; i++) {
			System.out.println(Arrays.toString(newArr[i]));
		}
		//write a java program to convert lowercase string to uppercase without using toUppercase method;
		String str = "viratkohli";
		String res = "";
		String newStr = "";
		for(int i = 0; i < str.length(); i++) {
		 newStr = newStr + (char)(str.charAt(i) - 32);
		}
		System.out.println(newStr);
		
		for(int i = 0; i < str.length(); i++) {
			if(i < str.length()/2) {
				res = res + (char)(str.charAt(i) - 32);
			}else {
				res = res + str.charAt(i);
			}
		}
		System.out.println(res);
	}

}
