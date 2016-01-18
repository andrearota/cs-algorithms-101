package com.andrearota.datastructure.graph;

public class LabelVertex extends Vertex {

	protected int label;
	protected Vertex previous;
	
	public LabelVertex(String name) {
		super(name);
		this.previous = null;
		this.label = -1;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	public Vertex getPrevious() {
		return previous;
	}

	public void setPrevious(Vertex previous) {
		this.previous = previous;
	}
	
}
