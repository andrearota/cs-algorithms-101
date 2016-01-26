package com.andrearota.general;

public class HuffmanDecoder {

	
	
	public class Node {
		public  int frequency;
	    public  char data;
	    public  Node left, right;
	}

	void decode(String S, Node root) {
	        
	    while(S.length() > 0) {
	        S = traverse(S, root);
	    }
	       
	}

	String traverse(String s, Node root) {
	  
	    String c = s.substring(0, 1);
	    String remaining = s.substring(1, s.length());
	
	    if(c.equals("0")) {
	    	if(root.left == null) {
	    		System.out.print(root.data);
	    		return remaining;
	    	} else {
	    		return traverse(remaining, root.left);
	    	}
	    } else {
	    	if(root.right == null) {
	    		System.out.print(root.data);
	    		return remaining;
	    	} else {
	    		return traverse(remaining, root.right);
	    	}
	    }
	    
	}
	
	
}
