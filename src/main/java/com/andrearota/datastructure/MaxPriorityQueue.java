package com.andrearota.datastructure;

public class MaxPriorityQueue {
	
	private int[] heap;
	private int heapSize = 0;
	
	public MaxPriorityQueue(int maxSize) {
		this.heap = new int[maxSize];
		this.heap[heapSize] = 0;
		this.heapSize++;
	}
	
	public void insert(int key) {
		this.heap[heapSize] = key;
		heapSize++;
		swim(this.heap, heapSize, heapSize-1);
	}
	
	public int deleteMax() {
		int result = getMax();
		
		this.heap[1] = this.heap[heapSize-1];
		heapSize--;
		
		sink(this.heap, heapSize, 1);
		
		return result;
	}
	
	public int getMax() {
		return this.heap[1];
	}
	
	public void swim(int heap[], int heapSize, int k) {
		
		int parent = (int) Math.floor(k/2.0);
		
		while(k > 1 && heap[k] > heap[parent]) {
			
			int temp = heap[k];
			heap[k] = heap[parent];
			heap[parent] = temp;
			
			k = parent;
			parent = (int) Math.floor(k/2.0);
		}
	}
	
	public void sink(int heap[], int heapSize, int k) {
		
		int child = 2*k;
		
		while(child <= heapSize) {
			if(child < heapSize && heap[child] < heap[child+1]) child++;
			if(heap[child] > heap[k]) {
				
				int temp = heap[k];
				heap[k] = heap[child];
				heap[child] = temp;
				
				k = child;
				child = 2*k;
			} else {
				break;
			}
		}
	}

}
