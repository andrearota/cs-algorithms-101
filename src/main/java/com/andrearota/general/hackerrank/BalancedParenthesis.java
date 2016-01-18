package com.andrearota.general.hackerrank;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BalancedParenthesis {

	public static void main(String[] args) {
		
		Queue<String> input = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		
		for(int i=0; i<testCases; i++) {
			String line = scanner.next();
			input.add(line);
		}
		
		scanner.close();
		
		while(!input.isEmpty()) {
			System.out.println(verifyBalance(input.poll()));
		}
		
		
	}

	private static String verifyBalance(String line) {
		
		Deque<String> stack = new LinkedList<String>();
		
		for(int i=0; i<line.length(); i++) {
			
			char c = line.charAt(i);
			String opening;
			
			switch (c) {
			case '{':
			case '[':
			case '(':
				stack.push(Character.toString(c));
				break;
			case ')':
				if(stack.isEmpty()) {
					return "NO";
				}
				opening = stack.pop();
				if(!opening.equals("(")){
					return "NO";
				}
				break;
			case ']':
				if(stack.isEmpty()) {
					return "NO";
				}
				opening = stack.pop();
				if(!opening.equals("[")){
					return "NO";
				}
				break;
			case '}':
				if(stack.isEmpty()) {
					return "NO";
				}
				opening = stack.pop();
				if(!opening.equals("{")){
					return "NO";
				}
				break;
				
			default:
				break;
			}

			
		}
		
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
