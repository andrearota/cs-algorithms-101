package com.andrearota.general.hackerrank;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MergingCommunities {
	
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int q = s.nextInt();
		
		MergingCommunities solver = new MergingCommunities(n);
	
		for(int k=0; k<q; k++) {
		
			String istr = s.next();
			int i, j;
			
			if(istr.equals("M")) {
				i = s.nextInt();
				j = s.nextInt();
				solver.meet(i, j);
			}
			
			if(istr.equals("Q")) {
				i = s.nextInt();
				System.out.println(solver.query(i));
			}
		}
		
		s.close();
	}

	private List<Set<Integer>> communities = new LinkedList<Set<Integer>>();
	
	public MergingCommunities(int n) {
		for(int i=0; i<n; i++) {
			Set<Integer> c = new HashSet<Integer>();
			c.add(i+1);
			communities.add(c);
		}
	}

	public int query(int value) {
		
		for(int i=0; i<communities.size(); i++) {
			if(communities.get(i).contains(value)) {
				return communities.get(i).size();
			};
		}
		
		return -1;
	}

	public void meet(int i, int j) {
		
		int aIdx = 0, bIdx = 0;
		
		for(int l=0; l<communities.size(); l++) {
			
			if(communities.get(l).contains(i)) {
				aIdx = l;
			};
			
			if(communities.get(l).contains(j)) {
				bIdx = l;
			};
		}
		
		if(aIdx != bIdx) {
			communities.get(aIdx).addAll(communities.get(bIdx));
			communities.remove(bIdx);
		}
		
	}
	
	

}
