package com.andrearota.general;

public class TwoStringSolution {

	public static boolean seachCommonSubstrings(String a, String b) {
		
		for(int i=0; i<a.length(); i++) {
			for(int j=0; j<b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)) {
					return true;
				}
			}
		}
		
		return false;
	}

}
