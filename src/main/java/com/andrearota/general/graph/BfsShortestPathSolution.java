package com.andrearota.general.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsShortestPathSolution {

	public static int[] getShortestDistances(List<Node> graph, String nodeName) {
		
		Queue<VisitStep> fringe = new LinkedList<VisitStep>();
		Node startNode = findNode(graph, nodeName);
		VisitStep firstStep = new VisitStep(null, startNode, 0);
		
		fringe.add(firstStep);
		
		while(!fringe.isEmpty()) {
			
			VisitStep currentStep = fringe.poll();
			Node currentNode = currentStep.getStartNode();
			
			if(currentStep.getParent() != null) {
				
			}
			
			
			
			for(Node neighboor: currentNode.getEdges()) {
				fringe.add(new VisitStep(currentNode, neighboor, 6));
			}
			
			
			
		}
		
		return null;
	}

	private static Node findNode(List<Node> graph, String nodeName) {
		
		for (Node node : graph) {
			if(node.getLabel().equals(nodeName)) {
				return node;
			}
		}
		
		return null;
	}

}
