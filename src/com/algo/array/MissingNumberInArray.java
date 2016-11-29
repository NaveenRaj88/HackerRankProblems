package com.algo.array;

/**
 * Created by Naveen Kumar .A on 11/28/16.
 */
public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] i = {1,2,3,4,6,7,8,9,10};
        int total = 0;
        for(int element : i){
            total+=element;
        }
        int expectedTotal = (10*(10+1))/2;
        System.out.println("missing number is "+ (expectedTotal-total));
    }
}
