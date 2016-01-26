package com.andrearota.general;

import java.util.PriorityQueue;

public class StreamingCounter {

	private PriorityQueue<Integer> pq;
	private int size;
	
	
	public StreamingCounter(int size) {
		this.size = size;
		this.pq = new PriorityQueue<Integer>(size);
	}

	public void submit(int value) {
		
		if(this.pq.size() > size) {
			this.pq.poll();
		}
		this.pq.add(value);
	}

	public Object getMaxValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
