package com.andrearota.general.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CommunityMerger {

    private int[] parents;
    private int[] sizes;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int q = s.nextInt();

        CommunityMerger merger = new CommunityMerger(n);

        for (int i = 0; i < q; i++) {
            String cmd = s.next();

            if (cmd.equals("Q")) {
                int member = s.nextInt();
                System.out.println(merger.query(member));
            }

            if (cmd.equals("M")) {
                int memberA = s.nextInt();
                int memberB = s.nextInt();
                merger.merge(memberA, memberB);
            }

        }

        s.close();
    }

    public CommunityMerger(int members) {

        parents = new int[members];
        sizes = new int[members];

        Arrays.fill(parents, -1);
        Arrays.fill(sizes, 1);
    }

    public int query(int member) {

        int root = findRepresentative(member - 1);
        return sizes[root];
    }

    private int findRepresentative(int member) {

        int curr = member;

        while (parents[curr] != -1) {
            curr = parents[curr];
        }

        // Path compression
        if (curr != member) {
            parents[member] = curr;
        }

        return curr;
    }

    public void merge(int memberA, int memberB) {

        int rootA = findRepresentative(memberA - 1);
        int rootB = findRepresentative(memberB - 1);

        if (rootA != rootB) {

            parents[rootB] = rootA;

            sizes[rootA] = sizes[rootA] + sizes[rootB];
            sizes[rootB] = -1;
        }

    }

}