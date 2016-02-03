package com.andrearota.datastructure.rbt;

public class RedBlackImpl implements RedBlackTree {

	//http://www.geeksforgeeks.org/red-black-tree-set-2-insert/
	
	private Node root;
	
	
	public Node leftRotate(Node x) {
		
		Node y = x.getParent();
		
		// Move y left subtree to x right subtree
		x.setRight(y.getLeft());
		x.getRight().setParent(x);
		
		// x parent is now y parent
		y.setParent(x.getParent());
		
		if(x.getParent().getLeft() == x) {
			x.getParent().setLeft(y);
		} else {
			x.getParent().setRight(y);
		}
		
		// x is now child of y
		y.setLeft(x);
		x.setParent(y);
		
		// return the new root of rotated subtree
		return x;
		
	}
	
	
	public void delete(int value) {
		
		
		

	}

	public void insert(int value) {
		
		Node n = new Node(value, NodeColor.RED, null, null, null);

		Node current = root;
		Node next = null;
		
		if(root == null) {
			root = n;
			// Root must be always black
			n.setColor(NodeColor.BLACK);
		} else {
			
			// This is a simple BST traversal
			while(current != null) {
				if(current.getData() > value) {
					next = current.getRight();
					if(next == null) {
						current.setRight(n);
						return;
					} else {
						current = next;
					}
					
				} else {
					next = current.getLeft();
					if(next == null) {
						current.setLeft(n);
						return;
					} else {
						current = next;
					}
				}
			}
		}
		
		
		

	}

	public Node search(int value) {
		
		Node current = root;
		Node next = null;
		
		while(current != null) {
			
			if(current.getData() == value) {
				return current;
			}
			
			if(current.getData() > value) {
				next = current.getRight();
			} else {
				next = current.getLeft();
			}
			
			current = next;
		}
		
		return null;
	}

}
