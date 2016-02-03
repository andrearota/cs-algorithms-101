package com.andrearota.datastructure.tree;

import java.util.LinkedList;
import java.util.List;

public class TreeNode {
	
	private int value;
	private List<TreeNode> children;
	
	public TreeNode() {
		this(0, new LinkedList<TreeNode>());
	}
	
	public TreeNode(int value) {
		this(value, new LinkedList<TreeNode>());
	}
	
	public TreeNode(int value, List<TreeNode> children) {
		super();
		this.value = value;
		this.children = children;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

}
