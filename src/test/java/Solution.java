

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	class Pair implements Comparable<Pair> {

		private int k, v;

		public Pair(int k, int v) {
			super();
			this.k = k;
			this.v = v;
		}

		public int getK() {
			return k;
		}

		public void setK(int k) {
			this.k = k;
		}

		public int getV() {
			return v;
		}

		public void setV(int v) {
			this.v = v;
		}

		@Override
		public String toString() {
			return "(" + this.getK() + ", " + this.getV() + ")";
		}

		public int compareTo(Pair p) {
			if (p.getK() == this.k) {
				return 0;
			} else if (p.getK() < this.k) {
				return +1;
			} else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {

		Solution solver = new Solution();
		Scanner scanner = new Scanner(System.in);

		final int n = scanner.nextInt();
		final int m = scanner.nextInt();

		Pair[] array = new Pair[2 * m];
		long[] sum = new long[2 * m];

		for (int i = 0; i < m; i++) {

			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int v = scanner.nextInt();

			array[2 * i] = solver.new Pair(a - 1, v);
			array[2 * i + 1] = solver.new Pair(b, -v);

		}

		Arrays.sort(array);

		scanner.close();

		int l = 0;
		int j = 0;

		while (l < 2 * m) {
			sum[j] += array[l].getV();
			int lastKey = array[l].getK();
			l++;
			while (l < 2 * m && array[l].getK() == lastKey) {
				sum[j] += array[l].getV();
				l++;
			}

			if (j + 1 < 2 * m) {
				sum[j + 1] = sum[j];
				j++;
			}
		}

		Arrays.sort(sum);
		System.out.println(sum[2 * m - 1]);

	}

}
