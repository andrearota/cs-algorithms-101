package com.andrearota.general.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LargestRectangle {

	public static void main(String[] args) {

		int[] heights;
		Scanner scanner = new Scanner(System.in);

		int buildings = scanner.nextInt();

		heights = new int[buildings];

		for (int i = 0; i < buildings; i++) {
			heights[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.println(maxArea(heights));

	}

	private static int maxArea(int[] heights) {
		
		int maxArea = 0;

		Map<Integer, Interval> closedAreas = new HashMap<Integer, Interval>();
		List<Interval> openAreas = new LinkedList<Interval>();

		for (int i = 0; i < heights.length; i++) {
			closeAreaTallerThan(openAreas, closedAreas, heights[i]);
			updateAreaShorterOrEqualTo(openAreas, heights[i], i);
		}

		closeAreaTallerThan(openAreas, closedAreas, 0);

		for (Entry<Integer, Interval> interval : closedAreas.entrySet()) {
			if (interval.getValue().getArea() > maxArea) {
				maxArea = interval.getValue().getArea();
			}
		}
		
		return maxArea;
	}

	private static void updateAreaShorterOrEqualTo(List<Interval> openAreas,
			int h, int i) {

		boolean exists = false;

		for (Interval candidate : openAreas) {
			if (candidate.getHeight() < h) {
				candidate.setEnd(i);
			}
			if (candidate.getHeight() == h) {
				candidate.setEnd(i);
				exists = true;
			}
		}

		if (!exists) {
			LargestRectangle r = new LargestRectangle();
			Interval newInterval = r.new Interval(h, i, i);
			openAreas.add(newInterval);
		}

	}

	private static void closeAreaTallerThan(List<Interval> openAreas,
			Map<Integer, Interval> closedAreas, int h) {

		for (Interval candidate : openAreas) {

			if (candidate.getHeight() > h) {
				Interval i = closedAreas.get(h);
				if (i == null || i.getArea() < candidate.getArea()) {
					closedAreas.put(h, candidate);
				}
			}
		}
	}

	class Interval {

		private int height;
		private int start;
		private int end;

		public Interval(int height, int start, int end) {
			this.height = height;
			this.start = start;
			this.end = end;
		}

		public int getArea() {
			return this.height * (this.end - this.start + 1);
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(int end) {
			this.end = end;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

	}

}
