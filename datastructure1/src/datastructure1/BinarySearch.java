package datastructure1;

public class BinarySearch {
	// igualzinho o teu código sor!!
	public static int searchInteractive(int[] a, int key) {
		int left = 0, right = a.length - 1;
		do {
			int mid = left + (right - left) / 2;
			
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		} while (left <= right);
		return -1;
	}

}
