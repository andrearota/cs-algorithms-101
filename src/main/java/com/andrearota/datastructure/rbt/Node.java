package com.andrearota.datastructure.rbt;

public class Node {
	
	private Integer data;
	private NodeColor color;
	private Node left;
	private Node right;
	private Node parent;
	
	public Node(Integer data) {
		this(data, NodeColor.BLACK, null, null, null);
	}
	
	public Node(Integer data, NodeColor color, Node parent, Node left, Node right) {
		super();
		this.data = data;
		this.color = color;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public NodeColor getColor() {
		return color;
	}

	public void setColor(NodeColor color) {
		this.color = color;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	@Override
	public String toString() {
		return ("(" + this.data + ", " + this.color + ")");
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
}
