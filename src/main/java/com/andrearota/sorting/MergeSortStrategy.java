package com.andrearota.sorting;

import java.util.Arrays;

import com.andrearota.util.ArrayUtil;

public class MergeSortStrategy implements SortingStrategy {

	public int[] sort(int[] arr) {

		if (arr.length <= 1) {
			return arr;
		} else {
			int middle = arr.length / 2;
			
			int[] left = Arrays.copyOfRange(arr, 0, middle);
			int[] right = Arrays.copyOfRange(arr, middle, arr.length);

			left = sort(left);
			right = sort(right);

			return ArrayUtil.merge(left, right);
		}

	}

}
