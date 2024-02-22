
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,8,11,20};
		int f = 0;
		int l = arr.length-1;
		int mid = 0, target = 8;;
		while(true) {
			mid = (f+l)/2;
			if(arr[mid] == target) {
				System.out.print("element found at index " + mid);
			}else if(target > arr[mid]) {
				f = mid+1;
			}else if(target < arr[mid]) {
				l = mid-1;
			}else if(f>l){
				System.out.print("element not found ");
				break;
			}
		}
	}

}
