package com.algo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Naveen Kumar .A on 8/10/16.
 */
public class MatchingSets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int xSum = 0;
        int ySum = 0;
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
            xSum += x[i];
        }
        for (int i = 0; i < n; i++) {
            y[i] = scan.nextInt();
            ySum += y[i];
        }

        if (xSum != ySum) {
            System.out.println(-1);
        } else {
            Arrays.sort(x);
            Arrays.sort(y);
            System.out.println(equaliseIndex(x, y));
        }
    }

    private static int equaliseIndex(int[] x, int[] y) {
        int operation =0;
        boolean condition = true;
        while(condition) {
            int leftIndex = getSmallerElementToIncrement(x, y);
            int rightIndex = getBiggerElementToDecrement(x, y);
            while(x[leftIndex]> y[leftIndex] && x[rightIndex] < y[rightIndex]){
                y[leftIndex] = ++y[leftIndex];
                y[rightIndex] = --y[rightIndex];
                operation++;
            }

            if(isElemEqual(x,y)){
                break;
            }
        }
        return operation;
    }

    private static boolean isElemEqual(int[] x, int[] y){
        for (int i = 0; i <x.length ; i++) {
            if(x[i] != y[i]){
                return false;
            }
        }
        return true;
    }

    private static int getSmallerElementToIncrement(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] > y[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int getBiggerElementToDecrement(int[] x, int[] y) {
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] < y[i]) {
                return i;
            }
        }
        return -1;
    }

}
