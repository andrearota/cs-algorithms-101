package com.andrearota.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.andrearota.util.ArrayUtil;

public class BFSIterativeStrategy implements VisitStrategy {

	// Fringe
	protected Queue<TreeNode> queue = new LinkedList<TreeNode>();
	
	@Override
	public int[] visit(TreeNode root) {
		
		LinkedList<Integer> values = new LinkedList<Integer>();

		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode e = queue.poll();
			values.add(e.getValue());
			queue.addAll(e.getChildren());
		}
		
		return ArrayUtil.unboxIntArray(values.toArray());

	}

}
