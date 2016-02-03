package com.andrearota.general.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private String label;
	private List<Node> edges;
	
	public Node(String label) {
		this.label = label;
		this.edges = new ArrayList<Node>();
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<Node> getEdges() {
		return edges;
	}
	public void setEdges(List<Node> edges) {
		this.edges = edges;
	}
	
	

}
