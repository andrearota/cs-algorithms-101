package com.andrearota.general.hackerrank;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianFinder {

	private PriorityQueue<Integer> rightHeap;
	private PriorityQueue<Integer> leftHeap;
	
	static public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MedianFinder solver = new MedianFinder();
		
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f\n", solver.add(scanner.nextInt()));
		}
		
		scanner.close();
	}
	
	public MedianFinder() {
		leftHeap = new PriorityQueue<Integer>(1, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				if(o1.intValue() == o2.intValue()) {
					return 0;
				} else if (o1.intValue() > o2.intValue()) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		rightHeap = new PriorityQueue<Integer>();
	}
	
	public float add(int value) {
		
		if(leftHeap.isEmpty() || rightHeap.isEmpty() || value < rightHeap.peek()) {
			leftHeap.add(value);
		} else {
			rightHeap.add(value);
		}
		
		if(leftHeap.size() - rightHeap.size() > 1) {
			Integer tmp = leftHeap.poll();
			rightHeap.add(tmp);
		}
		
		if(leftHeap.size() - rightHeap.size() < -1) {
			Integer tmp = rightHeap.poll();
			leftHeap.add(tmp);
		}
		
		if((leftHeap.size() + rightHeap.size()) % 2 != 0) {
			if(rightHeap.size() > leftHeap.size()) {
				return rightHeap.peek();
			} else {
				return leftHeap.peek();
			}
		} else {
			return (leftHeap.peek() + rightHeap.peek())/2.0f;
		}
		
	}

}
