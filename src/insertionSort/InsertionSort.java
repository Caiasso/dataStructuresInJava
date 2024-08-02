package insertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 7, 2, 5, 3, 9, 6, 0, 1, 8, 4};

		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
