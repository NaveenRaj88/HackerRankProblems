package com.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Naveen Kumar .A on 8/4/16.
 */
public class NonDivisibleSubset {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] set = new int[n];
        int[] modArr = new int[k];
        int index = 0;
        while(index<n){
            int nextElem = scan.nextInt();
            set[index++] = nextElem;
            int mod = nextElem % k;
            modArr[mod] = ++modArr[mod];
        }
        int maxSubset =0;
        for(int i =1; i<=k/2 ; i++){
            int j = k-i;
            if(i == j && modArr[i]>0){
                maxSubset++;
                continue;
            }
                maxSubset+=Math.max(modArr[i], modArr[j]);
        }
        if(modArr[0] >0){
            maxSubset++;
        }
        System.out.println(maxSubset);
    }
}
