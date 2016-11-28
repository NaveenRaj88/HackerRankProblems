package com.algo;

import java.util.Arrays;

/**
 * Created by Naveen Kumar .A on 11/28/16.
 */
public class BubbleSortInt {

    public static void main(String[] args) {
        int[] i = {5,2,1,3,8,7};
        for (int j = 0; j < i.length; j++) {
            for (int k = 1; k <i.length-j ; k++) {
                if(i[k-1] > i[k]){
                    int temp = i[k-1];
                    i[k-1] = i[k];
                    i[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(i));
    }
}
