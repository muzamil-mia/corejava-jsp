package arrays.twodArray;

import java.util.Arrays;

public class SumOfTwoMatrices {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
		int[][] newArr = new int[row][col];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				newArr[i][j] = arr[i][j] + arr1[i][j];
			}
		}
		for(int i = 0; i < newArr.length; i++) {
			System.out.println(Arrays.toString(newArr[i]));
		}
	}

}
