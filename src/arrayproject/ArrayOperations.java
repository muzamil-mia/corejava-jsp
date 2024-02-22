package arrayproject;

import java.util.Arrays;

public class ArrayOperations {
	
		public  int[] insert(int[] arr, int pos, int elem) {
			if(pos < 1 || pos > arr.length+1) {
				System.out.println("insertion not possible");
				return arr;
			}else {
				int[] res = new int[arr.length+1];
				for(int i = 0, j = 0; i < res.length; i++) {
					if(pos - 1 == i) {
						res[i] = elem;
					}else {
						res[i] = arr[j++];
					}
				}
				return res;
			}
		}
		
		public int[] delete(int[] arr, int elem) {
			int index = findPosition(arr, elem);
			if(isEmpty(arr)) {
				System.out.println("deletion not possible");
				return arr;
			} else if(index == -1) {
				System.out.println("element not present");
				return arr;
			}else {
				int[] res = new int[arr.length-1];
				for(int i = 0, j = 0; i < arr.length; i++) {
					if(i != index) {
						res[j++] = arr[i];
					}
				}
				return res;
			}
			
		}
		
		private int findPosition(int[] arr, int elem) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == elem) {
					return i;
				}
			}
			return -1;
		}

		public int[] deleteAll(int[] arr, int target) {
			int index = search(arr, target);
			if(isEmpty(arr)) {
				System.out.println("deletion not possible");
				return arr;
			}else if(index == -1) {
				System.out.println("element is not present");
				return arr;
			}else {
				int[] newArr = new int[arr.length-occurence(arr,target)];
				for(int i = 0, j=0; i < arr.length; i++) {
					if(target != arr[i]) {
						newArr[j++] = arr[i];
					}
				}
				return newArr;
			}
			
		}

		private int occurence(int[] arr, int target) {
			int count = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == target) {
					count++;
				}
			}
			return count;
		}

		private int search(int[] arr, int target) {
			for(int i =0; i < arr.length; i++) {
				if(arr[i] == target) {
					return i;
				}
			}
			return -1;
		}

		public int[] update(int[] arr, int old, int newElem) {
			int index = find(arr, old);
			if(index == -1) {
				System.out.println("updation not possible");
				return arr;
			}else {
				for(int i = 0; i < arr.length; i++) {
					if(i == index) {
						arr[i] = newElem;
						return arr;
					}
				}
			}
			return null;
		}

		public int[] updateAll(int[] arr, int elem, int r) {
			int index = find(arr, elem);
			if(isEmpty(arr)) {
				System.out.println("updation not possible");
				return arr;
			}else if(index == -1) {
				System.out.println("element not present");
				return arr;
			}else {
				for(int i = 0; i < arr.length; i++) {
					if(i == index) {
						arr[i] = r;
					}
				}
			}
			return arr;
		}

		private int find(int[] arr, int target) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == target) {
					return i;
				}
			}
			return -1;
		}
		
		public int[] merge(int[] arr, int[] arr1) {
			int k = 0;
			int[] newArr = new int[arr.length + arr1.length];
			if(isEmpty(arr)) {
				System.out.println("merging not possible");
				return arr;
				
			}
			for(int i = 0; i < arr.length; i++) {
				newArr[k++] = arr[i];
			}
			for(int i = 0; i < arr1.length; i++) {
				newArr[k++] = arr1[i];
			}
			return newArr;
			
		}

		public int findMax(int[] arr) {
			int max = arr[0];
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}

		public int[] reverse(int[] arr1) {
			
			int[] rev = new int[arr1.length];
			int j = 0;
			for(int i = arr1.length-1; i >= 0; i--) {
				rev[j++] = arr1[i];
			}
			return rev;
		}

		public int findMin(int[] arr) {
			int min = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[min] < min) {
					min = arr[i];
				}
			}
			return min;
		}

		public int firstOccurence(int[] arr, int target) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == target) {
					System.out.println(i);
					return i;
					
				}
			}
			return -1;
		}

		public int lastOccurence(int[] arr, int target) {
			int index = -1;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == target) {
					index = i;
				}
			}
			return index;
		}

		public int[] clear() {
			// TODO Auto-generated method stub
			return new int[0];
		}
		public boolean isEmpty(int[] arr) {
			return arr.length==0;
		}

		public static int[] sort(int[] arr) {
			for(int i = 0; i < arr.length - 1; i++) {
				int min = i;
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[min] > arr[j]) {
						min = j;
					}
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
			
			return arr;
			
		}

}
