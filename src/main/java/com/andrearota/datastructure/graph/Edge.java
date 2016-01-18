package com.andrearota.datastructure.graph;

public class Edge {

	protected int weight;
	protected Vertex destination;

	public Edge(Vertex dest, int weight) {
		super();
		this.destination = dest;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vertex getDestination() {
		return destination;
	}

	public void setDestination(Vertex destination) {
		this.destination = destination;
	}

}
