package com.andrearota.datastructure.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphAlgoritms {

	public static int[] relativeShortestDistances(List<LabelVertex> graph, String name) {

		Set<LabelVertex> S = new HashSet<LabelVertex>();
		Set<LabelVertex> T = new HashSet<LabelVertex>();

		LabelVertex start = findStartVertex(graph, name);
		start.setLabel(0);
		start.setPrevious(null);

		S.add(start);
		T.addAll(graph);
		T.remove(start);

		for (Edge e : start.getEdges()) {
			LabelVertex candidate = (LabelVertex) e.getDestination();
			candidate.setLabel(e.getWeight());
			candidate.setPrevious(start);
		}

		while (!areAllVertexReached(T)) {

			LabelVertex next = findClosestNeighboor(T);
			S.add(next);
			T.remove(next);

			if (!T.isEmpty()) {
				for (Edge e : next.getEdges()) {
					LabelVertex v = (LabelVertex) e.getDestination();
					if (T.contains(v) && v.getLabel() > next.getLabel() + e.getWeight()) {
						v.setLabel(next.getLabel() + e.getWeight());
						v.setPrevious(next);
					}
				}
			}
		}

		return prepareResult(graph, name);

	}

	private static int[] prepareResult(List<LabelVertex> graph, String name) {

		int[] result = new int[graph.size() - 1];
		int index = 0;

		for (LabelVertex v : graph) {
			if (!v.getName().equals(name)) {
				result[index] = v.getLabel();
				index++;
			}
		}

		return result;
	}

	private static LabelVertex findClosestNeighboor(Set<LabelVertex> fringe) {

		LabelVertex closest = null;

		for (LabelVertex v : fringe) {
			if (closest == null || v.getLabel() < closest.getLabel()) {
				closest = v;
			}
		}

		return closest;
	}

	private static boolean areAllVertexReached(Set<LabelVertex> fringe) {

		for (LabelVertex v : fringe) {
			if (v.getLabel() != -1) {
				return false;
			}
		}

		return true;
	}

	private static LabelVertex findStartVertex(List<LabelVertex> graph, String name) {

		for (LabelVertex v : graph) {
			if (v.getName().equals(name)) {
				return v;
			}
		}

		return null;

	}

}
