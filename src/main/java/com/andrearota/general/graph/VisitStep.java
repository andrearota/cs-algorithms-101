package com.andrearota.general.graph;

public class VisitStep {

	protected Node parent;
	protected Node startNode;
	protected int distance;

	public VisitStep(Node parent, Node startNode, int distance) {
		this.parent = parent;
		this.startNode = startNode;
		this.distance = distance;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getStartNode() {
		return startNode;
	}

	public void setStartNode(Node startNode) {
		this.startNode = startNode;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}
