package com.andrearota.util;

public class ArrayUtil {

	public static int[] merge(int[] arr1, int[] arr2) {

		int[] result = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i = i + 1;
			} else {
				result[k] = arr2[j];
				j = j + 1;
			}

			k = k + 1;
		}

		while (i < arr1.length) {
			result[k] = arr1[i];
			i = i + 1;
			k = k + 1;
		}

		while (j < arr2.length) {
			result[k] = arr2[j];
			j = j + 1;
			k = k + 1;
		}

		return result;
		
	}

	public static void swap(int[] arr, int l, int m) {
		int tmp = arr[l];
		arr[l] = arr[m];
		arr[m] = tmp;
	}

}
