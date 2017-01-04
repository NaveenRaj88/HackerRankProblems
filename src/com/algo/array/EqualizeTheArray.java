package com.algo.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Naveen Kumar .A on 12/11/16.
 *
 * Karl has an array of integers defined as . In one operation, he can delete any element from the array.
 *
 *Karl wants all the elements of the array to be equal to one another. To do this, he must delete zero or
 * more elements from the array. Find and print the minimum number of deletion operations Karl must perform
 * so that all the array's elements are equal.
 */

public class EqualizeTheArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i < n; i++){
            arr[i] = in.nextInt();
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
    }

    static int findKeyOfMaxValueInMap(Map<Integer, Integer> map){
        int maxValue = Integer.MIN_VALUE;
        int maxKey =0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
