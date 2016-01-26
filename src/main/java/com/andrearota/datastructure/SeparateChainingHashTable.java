package com.andrearota.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SeparateChainingHashTable implements HashTable {

	protected final static int SIZE = 10;
	
	@SuppressWarnings("unchecked")
	protected List<Pair>[] entries = new List[SIZE];
	
	protected class Pair {
		
		private int k;
		private String v;
		
		public Pair(int k, String v) {
			this.k = k;
			this.v = v;
		}

		public int getK() {
			return k;
		}

		public void setK(int k) {
			this.k = k;
		}

		public String getV() {
			return v;
		}

		public void setV(String v) {
			this.v = v;
		}

	}
	
	public SeparateChainingHashTable() {
		for (int i = 0; i < entries.length; i++) {
			entries[i] = new LinkedList<SeparateChainingHashTable.Pair>();
		}
	}
	
	
	public void put(int k, String v) {
		Pair p = new Pair(k, v);
		List<Pair> chain = getChainedList(k);
		chain.add(p);
	}

	private List<Pair> getChainedList(int k) {
		int hash = hash(k);
		return entries[hash];
	}

	private int hash(int k) {
		return k%SIZE;
	}

	
	public String get(int k) {
		
		List<Pair> chain = getChainedList(k);
		
		for(Pair p: chain) {
			if(p.getK() == k) {
				return p.getV();
			}
		}
		
		return null;
	}
	
	
	public int size() {
		
		int result = 0;
		
		for (int i = 0; i < entries.length; i++) {
			result += entries[i].size();
		}
		
		return result;
	}
	
	public boolean delete(int k) {
		
		List<Pair> chain = getChainedList(k);
		Iterator<Pair> iter = chain.iterator();
		
		while(iter.hasNext()) {
			if(iter.next().getK() == k) {
				iter.remove();
				return true;
			}
		}
		
		return false;
		
	}

}
