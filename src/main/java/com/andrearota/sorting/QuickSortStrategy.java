package com.andrearota.sorting;

import com.andrearota.util.ArrayUtil;

public class QuickSortStrategy implements SortingStrategy {

	public int[] sort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
		return arr; 
	}

	private void quickSort(int[] arr, int left, int right) {

		int index = partition(arr, left, right);
		
		if(left < index - 1) {
			quickSort(arr, left, index-1);
		}
		
		if(index < right) {
			quickSort(arr, index, right);
		}
		
	}

	private int partition(int[] arr, int left, int right) {
		
		int i = left;
		int j = right;
		int pivot = arr[left+(right-left)/2];
		
		while (i <= j) {
			
			while(arr[i] < pivot) {
				i++;
			}
			
			while(arr[j] > pivot) {
				j--;
			}
			
			if(i <= j) {
				ArrayUtil.swap(arr, i, j);
				i++;
				j--;
				
			}
			
		}
		
		return i;
	
	}




}
