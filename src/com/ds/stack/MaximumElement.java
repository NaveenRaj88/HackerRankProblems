package com.ds.stack;

import java.util.Scanner;

/**
 * Created by anandran on 3/23/17.
 */
public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ind = 0;
        int[] stack = new int[n];
        int[] maxStack = new int[n];
        while (n-- > 0) {
            int command = scan.nextInt();
            if (command == 1) {
                stack[ind] = scan.nextInt();
                if (ind > 0) {
                    maxStack[ind] = Math.max(stack[ind], maxStack[ind - 1]);
                } else {
                    maxStack[ind] = stack[ind];
                }
                ind++;
            } else if (command == 2) {
                stack[--ind] = 0;
                maxStack[ind] = 0;
            } else if (command == 3) {
                System.out.println(maxStack[ind-1]);
            }
        }
    }
}
