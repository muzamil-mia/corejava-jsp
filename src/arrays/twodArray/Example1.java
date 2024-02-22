package arrays.twodArray;
import java.util.Arrays;
public class Example1 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print((arr[row][col] + " "));
			}
			System.out.println();
		}
		
		for(int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		System.out.println();
		
		for(int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}

}
