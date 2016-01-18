package com.andrearota.general.hackerrank;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int moves = scanner.nextInt();
		
		Deque<Integer> stack = new LinkedList<Integer>();

		for (int i = 0; i < moves; i++) {
			
			int command = scanner.nextInt();
			int arg;
			int currentMax = stack.peek() != null ? stack.peek() : Integer.MIN_VALUE;

			switch(command) {
			case 1:
				
				arg = scanner.nextInt();
							
				if(arg < currentMax) {
					stack.push(currentMax);
				} else {
					stack.push(arg);
				}
				
				break;
				
			case 2:
				stack.pop();
				break;
				
			case 3:
				System.out.println(currentMax);
				break;
			}
		}

		scanner.close();


	}

}
