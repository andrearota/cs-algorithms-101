package com.andrearota.general;

import java.util.ArrayList;
import java.util.List;

public class SimpleNode {
	public SimpleNode(int value) {
		this.value = value;
	}
	
	public int value;
	public List<SimpleNode> children = new ArrayList<SimpleNode>();
}