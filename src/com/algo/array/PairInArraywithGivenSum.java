package com.algo.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Naveen Kumar .A on 11/29/16.
 */
public class PairInArraywithGivenSum {

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };

        printPairBrute(numbers, 7);
        printPairBrute(numbersWithDuplicates, 7);

        System.out.println();
        printPairHashSetMeth(numbers, 7);
        printPairHashSetMeth(numbersWithDuplicates, 7);


        System.out.println();
        printPairsUsingSort(numbers, 7);
        printPairsUsingSort(numbersWithDuplicates, 7);

    }

    private static void printPairBrute(int[] i, int sum){
        for (int j = 0; j <i.length; j++) {
            int current = i[j];
            for (int k = j+1; k <i.length ; k++) {
                if(current+i[k] == sum){
                    System.out.println("the pair of elements whose sum is"+sum+" are "+current+" & "+i[k]);
                }
            }
        }
    }

    private static void printPairHashSetMeth(int[] i , int sum){
        int len = i.length;
        Set<Integer> set = new HashSet<>(len);

        for (int in : i){
            int target =  sum-in;
            if(!set.contains(target)){
                set.add(in);
            }else{
                System.out.println("the pair of elements whose sum is"+sum+" are "+in+" & "+target);
            }
        }

    }

    private static void printPairsUsingSort(int[] i, int sum){
        Arrays.sort(i);
        for (int j = 0, k = i.length-1; j <k ;) {
            if(i[j]+i[k] == sum){
                System.out.println("the pair of elements whose sum is"+sum+" are "+i[j]+" & "+i[k]);
                j++;
                k--;
            }else if(i[j]+i[k]< sum){
                j++;
            }else{
                k--;
            }
        }
    }
}
