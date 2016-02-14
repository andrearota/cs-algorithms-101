package com.andrearota.datastructure.tree;

public class AvlTree {

	public AvlNode rotateLeft(AvlNode x) {

		AvlNode y = x.right;
		x.right = y.left;
		y.left = x;

		x.height = max(subTreeHeight(x.left), subTreeHeight(x.right)) + 1;
		y.height = max(subTreeHeight(y.left), subTreeHeight(y.right)) + 1;

		return y;
	}

	public AvlNode rotateRight(AvlNode x) {

		AvlNode y = x.left;
		x.left = y.right;
		y.right = x;

		x.height = max(subTreeHeight(x.left), subTreeHeight(x.right)) + 1;
		y.height = max(subTreeHeight(y.left), subTreeHeight(y.right)) + 1;

		return y;
	}

	public int subTreeHeight(AvlNode subroot) {
		if (subroot != null) {
			return subroot.height;
		} else {
			return 0;
		}
	}

	public int max(int a, int b) {
		return a >= b ? a : b;
	}

	public int getBalanceFactor(AvlNode node) {
		if (node == null) {
			return 0;
		} else {
			return subTreeHeight(node.left) - subTreeHeight(node.right);
		}
	}
	
	public AvlNode insert(int value, AvlNode node) {
		
		//BST insertion and update subtree height
		
		if(node==null) {
			return new AvlNode(value);
		}
		
		if(value < node.key) {
			node.left = insert(value, node.left);
		} else {
			node.right = insert(value, node.right);
		}
		
		node.height = max(subTreeHeight(node.left), subTreeHeight(node.right)) + 1;
		
		int balance = getBalanceFactor(node);
		
		// Right right
		if(balance > 1 && value < node.left.key) {
			return rotateRight(node);
		}
		
		// Left left
		if(balance < -1 && value > node.right.key) {
			return rotateLeft(node);
		}
		
		// Left right
		if(balance > 1 && value > node.left.key) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}
		
		// Right left
		if(balance < -1 && value < node.right.key) {
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}		
		
		return node;
	}

}
