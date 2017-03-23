package com.ds.stack;

import java.util.Scanner;

/**
 * Created by anandran on 3/23/17.
 */
public class GameOfTwoStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for (int a0 = 0; a0 < g; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for (int b_i = 0; b_i < m; b_i++) {
                b[b_i] = in.nextInt();
            }
            int sum = 0;
            int i = 0, j = 0;
            int elemRemoved = 0;
            while (i < n && j < m) {
                if (a[i] < b[j] && (sum + a[i] < x)) {
                    sum += a[i++];
                    elemRemoved++;
                } else if (sum + b[j] < x) {
                    sum += b[j++];
                    elemRemoved++;
                } else {
                    j = m;
                }
            }

            while (i < n && sum + a[i] < x) {
                sum +=a[i++];
                elemRemoved++;
            }

            System.out.println(elemRemoved);
        }
    }
}
