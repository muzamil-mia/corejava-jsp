package arrays.twodArray;

public class DiagonalSum {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if((i+j) == arr.length-1 || i == j) {
					sum = sum + arr[i][j];
				}
			}
		}
		int sum1 = 0;
		System.out.println(sum);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == j && j == arr[i].length-1) {
					sum1 = sum1 + arr[i][i] + arr[i][arr[i].length-1];
				}
			}
		}
		System.out.println(sum1);
		
	}

}
