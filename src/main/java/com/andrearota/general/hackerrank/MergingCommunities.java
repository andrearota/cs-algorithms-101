package com.andrearota.general.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

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

	private int[] array;
	private int[] size;
	
	public MergingCommunities(int n) {
		array = new int[n+1];
		size = new int[n+1];
		Arrays.fill(array, -1);
		Arrays.fill(size, 1);
	}

	public int query(int value) {
		int x = findRepr(value);
		return size[x];
	}

	public void meet(int i, int j) {
		int x = findRepr(i);
		int y = findRepr(j);
		
		if(x != y) {
			array[x] = y;
			size[y]++;
		}
		
	}
	
	private int findRepr(int value) {
		
		while(array[value] != -1) {
			value = array[value];
		}
		
		return value;
	}

}
