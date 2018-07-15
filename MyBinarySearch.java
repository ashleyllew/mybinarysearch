
public class MyBinarySearch {

	public static void main(String[] args) {
		int [] array = new int [10];
		for (int i = 0, j = array.length-1; i < array.length && j>=0; i++, j--) {
			array[i] = j;
		}
		MyOwnSelectionSort(array);
		boolean contains = BinarySearch(array, 3);
		System.out.println("contains? " + contains);
	}
	
	public static boolean BinarySearch(int [] array, int element) {
		int low = 0;
		int high = array.length - 1;
		
		while (low <= high) {
			int mid = (low+high) / 2;
			if (element == array[mid]) {
				return true;
			}
			else if (element < array[mid]) {
				high = mid - 1;
			}
			else if (element > array[mid]) {
				low = mid + 1;
			}
		}
		return false;
	}
		
//		for (int i = 0; i < array.length; i++) {
//			if (element == array[parameters/2]) {
//				return true;
//			}
//			else if (element < array[parameters/2]) {
//				parameters = parameters/2;
//			}
//			else if (element > array[parameters/2]) {
//				parameters = 
//			}
//	}
	
	public static void MyOwnSelectionSort (int [] array) {
		int currentSmallest;
		int currentSmallestIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			currentSmallest = array[i];
			currentSmallestIndex = i;
			for (int j = currentSmallestIndex + 1; j < array.length; j++) {
				if (array[currentSmallestIndex] > array[j]) {
					currentSmallest = array[j];
					currentSmallestIndex = j;
				}
			}
			array[i] = currentSmallest;
			array[currentSmallestIndex] = current;
		}
	}
	
	public static void MyOwnInsertionSort (int [] array) {
		System.out.println("Unsorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("element: " + array[i]);
		}
		for (int i = 1; i < array.length; i++) {
			int j;
			int tmp = array[i];
			
			for (j = i; j > 0; j--) {
				if (tmp < array[j-1]) {
					array[j] = array[j-1];
				}
			}
			array[j] = (int) tmp;
		}
		System.out.println("Sorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("element: " + array[i]);
		}
	}
	
}
