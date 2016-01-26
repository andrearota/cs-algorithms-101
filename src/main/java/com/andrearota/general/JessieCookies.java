package com.andrearota.general;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class JessieCookies {
	
	private LinkedList<Integer> queue;
	private int limit;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		JessieCookies solver = new JessieCookies(k);
		
		for(int i=0; i<n; i++) {
			solver.add(scanner.nextInt());
		}
		
		scanner.close();
		
		System.out.println(solver.solve());
	}
	
	public JessieCookies(int k) {
		this.limit = k;
		this.queue = new LinkedList<Integer>();
	}
	
	public void add(int sweetness) {
		this.queue.add(sweetness);
	}
	
	public int solve() {
		
		int result = 0;
		
		if(queue.size() <= 1) {
			return -1;
		}

		while (!queue.isEmpty()) {
			Collections.sort(queue);

			int curr = queue.poll();

			if (curr >= limit) {
				return result;
			} else {
				Integer next = queue.poll();
				if (next == null && result == 0) {
					return -1;
				} else {
					int combined = 2 * curr + next;
					result++;

					if (combined < limit) {
						queue.push(combined);
					}
				}
			}
		}
		
		return result;
	}

}
