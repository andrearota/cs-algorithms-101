package com.andrearota.datastructure.tree;

import java.util.LinkedList;

import com.andrearota.util.ArrayUtil;

public class DFSPostorderRecursiveStrategy implements VisitStrategy {


	@Override
	public int[] visit(TreeNode root) {

		LinkedList<Integer> values = new LinkedList<Integer>();
		visitTree(root, values);

		return ArrayUtil.unboxIntArray(values.toArray());

	}

	private void visitTree(TreeNode node, LinkedList<Integer> values) {
		
		for (TreeNode n : node.getChildren()) {
			visitTree(n, values);
		}
		
		values.add(node.getValue());
	}

}
