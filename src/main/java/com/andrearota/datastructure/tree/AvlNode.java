package com.andrearota.datastructure.tree;

public class AvlNode {
	
	public int key;
	public int height;
	public AvlNode left, right;
	
	public AvlNode(int key) {
		this.key = key;
		this.height = 1;
	}

}
