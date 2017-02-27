package com.algo.array;

import java.util.Arrays;

/**
 * Created by anandran on 2/27/17.
 */
public class ArrayLeftRotation {

    static void printLeftRotatedArray(int[] ar, int lr) {
        int[] lar = new int[ar.length];
        int length = ar.length;
        for (int i = 0; i < length; i++) {
            int index = i - lr;
            if (index < 0) {
                lar[length + index]= ar[i];
            } else {
                lar[index] = ar[i];
            }
        }
        System.out.println(Arrays.toString(lar));
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        printLeftRotatedArray(ar,3);
    }
}
