import java.util.Arrays;

public class ArrayGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,8,4,7,1,6,2,5,9,11,15};
		int length = arr.length;
		int n = 2, first = 0;
		while(length > 2) {
			for(int i = first; i <= n; i++) {
				arr[n--] = arr[i];
				length--;
			}
			n+=3;
			first+=3;
		}
		System.out.println(Arrays.toString(arr));
	}

}
