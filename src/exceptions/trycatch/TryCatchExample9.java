package exceptions.trycatch;

public class TryCatchExample9 {

	public static void main(String[] args) {
		try {
			int[] arr = {1,2,3,4};
			System.out.println(arr[10]);
		}catch (ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj);
		}
		System.out.println("rest of the code");
	}

}
