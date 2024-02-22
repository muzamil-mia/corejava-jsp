package exam;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,-7,-2,3,4,7,-5,6,1,-7,4,1};
		int sum = arr[0];
		int first = -1, last = -1, maxSum = sum;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				sum = sum + arr[j];
				
			}
			System.out.println(sum);
//			if(sum > maxSum) {
//				maxSum = sum;
//				first = i;
//				last = j;
//			}
		}
		//System.out.print(maxSum);
		for(int i = first; i <= last; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
