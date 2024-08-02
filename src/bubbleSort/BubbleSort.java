package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 5, 3, 9, 6, 0, 1, 8, 4 };

		boolean changed;

		System.out.println(Arrays.toString(arr));
		do {
			changed = false;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					changed = true;
				}
			}
		} while (changed);

		System.out.println(Arrays.toString(arr));
	}
}
