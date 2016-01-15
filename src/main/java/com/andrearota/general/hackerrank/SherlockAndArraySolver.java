package com.andrearota.general.hackerrank;

public class SherlockAndArraySolver {

	
	// 10 18 20 -38
	
	public boolean solve(int[] input) {

		int sumRight = 0;
		int sumLeft = 0;
		
		for(int i=0; i<input.length; i++) {
			sumRight += input[i];
		}
		
		if(sumRight - input[0] == 0) {
			return true;
		}
		
		if(sumRight - input[input.length-1] == 0) {
			return true;
		}
		
		for(int j=1; j<input.length; j++) {
			
			sumLeft = sumLeft + input[j-1];
			sumRight = sumRight - input[j];
			
			if(sumLeft == sumRight) {
				return true;
			}
		}
		
		return false;
	}

}
