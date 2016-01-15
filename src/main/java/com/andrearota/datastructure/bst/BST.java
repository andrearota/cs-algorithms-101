package com.andrearota.datastructure.bst;

public class BST {

	public static boolean search(BinaryTreeNode tree, int n) {

		if (tree == null) {
			return false;
		} else {
			
			int value = tree.getValue();
			
			if (value < n) {
				return BST.search(tree.getRight(), n);
			} else if (value > n) {
				return BST.search(tree.getLeft(), n);
			} else {
				return true;
			}
		}

	}

	public static Object insert(BinaryTreeNode tree, int n) {
		
			int value = tree.getValue();
			
			if (value < n) {
				
				BinaryTreeNode next = tree.getRight();
				
				if(next == null) {
					tree.setRight(new BinaryTreeNode(n));
					return true;
				} else {
					return BST.insert(next, n);					
				}
				
			} else if (value > n) {
				
				BinaryTreeNode next = tree.getLeft();
				
				if(next == null) {
					tree.setRight(new BinaryTreeNode(n));
					return true;
				} else {
					return BST.insert(next, n);					
				}
				
			} else {
				return false;
			}
		
	}

}
