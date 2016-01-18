package com.andrearota.datastructure.bst;

public class BST {

	public static BinaryTreeNode search(BinaryTreeNode tree, int n) {

		if (tree == null) {
			return null;
		} else {
			
			int value = tree.getValue();
			
			if (value < n) {
				return BST.search(tree.getRight(), n);
			} else if (value > n) {
				return BST.search(tree.getLeft(), n);
			} else {
				return tree;
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
	
	public void delete(BinaryTreeNode tree, int key) {
		
		BinaryTreeNode toDelete = BST.search(tree, key);
		
		if(toDelete != null) {
			
			if(toDelete.getLeft() == null && toDelete.getRight() == null) {
				// Leaf
				return;
			} else if(toDelete.getLeft() == null ^ toDelete.getRight() == null) {
				// Single child
				return;
			} else {
				
			}
			
			
			
			
		}
		
	}

}
