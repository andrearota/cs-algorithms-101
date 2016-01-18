package com.andrearota.datastructure.graph;

import java.util.LinkedList;
import java.util.List;

public class Vertex {

	protected String name;
	protected List<Edge> edges;

	public Vertex(String name) {
		this.name = name;
		this.edges = new LinkedList<Edge>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
	
	
}
