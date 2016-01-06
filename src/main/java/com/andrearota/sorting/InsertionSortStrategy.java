package com.andrearota.sorting;

public class InsertionSortStrategy implements SortingStrategy {

	public int[] sort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			
			int value = arr[i];
			int j = i - 1;
			
			while(j >= 0 && value < arr[j]) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			
			arr[j+1] = value;
			
		}
		
		return arr;
	}

}
