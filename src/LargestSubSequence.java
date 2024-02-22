
public class LargestSubSequence {

	public static void main(String[] args) {
		int arr[] = {2,4,5,3,4,6,7,9,15,4,7,8,12,17,1,2,5,7};
		int previousMax = arr[0];
		int previousCount = 1;
		int start = 0;
		int count = 0, last = -1, currentStart = 0;
		for(int i = 1; i < arr.length; i++) { 
			if(arr[i] > arr[i-1]) {
				count++;
			}else {
				currentStart = i;
				count = 1;
			}
				if(count > previousCount) {
					start = currentStart;
				last = i;
				previousCount = count;
				
			}
		}
		
		for(int i = start; i <= last; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
