package com.algo.implementation;

import java.util.Scanner;

/**
 * Created by anandran on 3/26/17.
 */
public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        int rankIndex = 0;
        int rankScore = Integer.MAX_VALUE;
        int[] rank = new int[n];
        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();
            if (scores[scores_i] < rankScore) {
                rank[++rankIndex] = scores[scores_i];
                rankScore = scores[scores_i];
            }
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        int aliceTotal = 0;
        for (int alice_i = 0; alice_i < m; alice_i++) {
            aliceTotal += in.nextInt();
            System.out.println(getRank(rank, 1, rankIndex, aliceTotal));
        }

        // your code goes here
    }

    private static int getRank(int[] rank, int start, int max, int score) {
        if (rank[start] < score) {
            return Math.max(1, start);
        }else if(rank[max] > score) {
            return max+1;
        }
        int mid = (max + start) / 2;
        if (rank[mid - 1] > score && rank[mid] < score) {
            return mid;
        } else if (rank[mid] > score) {
            return getRank(rank, mid+1, max, score);
        } else {
            return getRank(rank,  start,mid, score);
        }
    }
}
