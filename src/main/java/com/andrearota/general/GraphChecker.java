package com.andrearota.general;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GraphChecker {
	
	public static boolean verifyBST(SimpleNode start) {
		
		// The graph with start node in START is a BST only if:
		// Every node has max 2 children
		// When there are two children, one has a smaller value than the node itself
		// There must not be circles (because it wouldn't be a tree!)
		
		Queue<SimpleNode> fringe = new LinkedList<SimpleNode>();
		Set<SimpleNode> visited = new HashSet<SimpleNode>();
		
		fringe.add(start);
		
		
		while(!fringe.isEmpty()) {
			
			SimpleNode n = fringe.poll();
			visited.add(n);
			
			if(n.children.size() > 2) {
				return false;
			} else if (n.children.size() == 2) {
				
				SimpleNode c1 = n.children.get(0);
				SimpleNode c2 = n.children.get(1);
				
				if (c1.value < n.value && c2.value >= n.value || c2.value < n.value && c1.value >= n.value) {
					if (!visited.contains(c1) && !visited.contains(c2)) {
						fringe.add(c1);
						fringe.add(c2);
					} else {
						return false;
					}
					
				} else {
					return false;
				}
			} else {
				if(n.children.size() == 1) {
					if(!visited.contains(n.children.get(0))) {
						fringe.add(n.children.get(0));
					} else {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	public static void toList(List<Integer> list, SimpleNode c) {
				
		
		if(c.children.size() == 2) {
			if(c.children.get(0).value < c.children.get(1).value) {
				toList(list, c.children.get(0));
				list.add(c.value);
				toList(list, c.children.get(1));
			} else {
				toList(list, c.children.get(0));
				list.add(c.value);
				toList(list, c.children.get(1));
			}
		} else if(c.children.size() == 1) {
			if(c.children.get(0).value < c.value) {
				toList(list, c.children.get(0));
				list.add(c.value);
			} else {
				list.add(c.value);
				toList(list, c.children.get(0));
			}
		} else {
			list.add(c.value);
		}
		
		
	}

}
