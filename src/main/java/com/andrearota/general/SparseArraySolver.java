package com.andrearota.general;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArraySolver {
	
	private Map<String, Integer> map;
	
	public SparseArraySolver() {
		this.map = new HashMap<String, Integer>();
	}

	public void addString(String s) {
		Integer count = map.get(s);
		
		if(count == null) {
			count = new Integer(1);
		} else {
			count = count + 1;
		}
		
		map.put(s, count);
	}

	public int findOccurences(String q) {
		Integer count = map.get(q);
		if(count == null) {
			return 0;
		} else {
			return count;
		}
	}
	
	public static void main(String[] args) {
		
		SparseArraySolver solver = new SparseArraySolver();
		Scanner scanner = new Scanner(System.in);
		
		int strings = scanner.nextInt();
		
		for(int i=0; i<strings; i++) {
			solver.addString(scanner.next());
		}
		
		int queries = scanner.nextInt();
		
		for(int i=0; i<queries; i++) {
			System.out.println(solver.findOccurences(scanner.next()));
		}
		
		scanner.close();
	}

}
