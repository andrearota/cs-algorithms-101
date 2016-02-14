package com.andrearota.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AlgorithmCrushSolver {
	
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
	
	protected List<Pair> v;
	protected long[] s;
	
	public AlgorithmCrushSolver(int n, int m) {
		this.v = new LinkedList<Pair>();
		this.s = new long[2*m];
	}
	
	public void add(int a, int b, int k) {
		v.add(new Pair(a, k));
		v.add(new Pair(b+1, -k));
		System.out.println(Arrays.toString(v.toArray()));
	}

	public Long solve() {
		Collections.sort(v);
		
		System.out.println(Arrays.toString(v.toArray()));
		
		int i = 0;
		s[i] = v.get(i).getV();
		
		while(i < v.size() - 1) {
			
			int j = i + 1;
			s[i+1] += v.get(j).getV();
			j++;
			
			while(j < v.size() && v.get(i).getK() == v.get(j).getK()) {
				s[i+1] += v.get(j).getV();
				j++;
			}
			
			i++;
		}
		
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));

		
		return s[0];
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		final int n, m;
		n = s.nextInt();
		m = s.nextInt();
		AlgorithmCrushSolver solver = new AlgorithmCrushSolver(n, m);
		
		for(int i=0; i<m; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int k = s.nextInt();
			
			solver.add(a, b, k);
		}

		System.out.println(solver.solve());
		
		s.close();
	}

}
