package com.andrearota.datastructure.rbt;

public class RedBlackImpl implements RedBlackTree {

	//http://www.geeksforgeeks.org/red-black-tree-set-2-insert/
	
	private Node root;
	
	public void delete(int value) {
		
		
		

	}

	public void insert(int value) {
		Node n = new Node(value, NodeColor.RED, null, null);

		Node current = root;
		Node next = null;
		
		if(root == null) {
			root = n;
			// Root must be always black
			n.setColor(NodeColor.BLACK);
		} else {
		
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
