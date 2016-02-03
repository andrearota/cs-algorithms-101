package com.andrearota.general;

public class Pair implements Comparable<Pair> {
	
	private int k;
	private long v;
	
	public Pair(int k, long v) {
		this.k = k;
		this.v = v;
	}
	
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public long getV() {
		return v;
	}
	public void setV(long v) {
		this.v = v;
	}

	@Override
	public int compareTo(Pair o) {
		if(this.k != o.k) {
			return this.k > o.k? 1: -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "(" + this.k + ", " + this.v + ")";
	}
}