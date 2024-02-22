package arrays.singleDarray.searching;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] arr =  {-2,1,-3,4,-1,2,1};
		int maxSum = Integer.MIN_VALUE;
		int first = 0, last = 0;
		for(int i = 0; i < arr.length; i++) {
			int currentSum = 0;
			for(int j = i; j < arr.length; j++) {
				currentSum += arr[j];
				if(currentSum > maxSum) {
					maxSum = currentSum;
					first = i;
					last = j;
				}
			}
		}
		System.out.println(maxSum);
		for(int i = first; i <= last; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
