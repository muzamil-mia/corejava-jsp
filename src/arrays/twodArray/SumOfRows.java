package arrays.twodArray;

import java.util.Arrays;

public class SumOfRows {

	public static void main(String[] args) {
		int[][] arr = {{5,3,8},{6,4,7},{9,13,1}};
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				newArr[i] = sum;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}
