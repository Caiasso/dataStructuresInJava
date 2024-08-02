package selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 7, 2, 5, 3, 9, 6, 0, 1, 8, 4 };

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}
