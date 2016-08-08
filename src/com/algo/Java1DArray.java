package com.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int count =0;
        while(count <n){
            arr[count] = in.nextInt();
            count++;
        }
//        12345
//        1,2,3,4,5,12,123,1234,12345,23,234,2345,34,345,45  = 15 
//        
//        123456
//        
//        1,2,3,4,5,6,12,123,1234,12345,123456,23,234,2345,23456,34,345,3456,45,456,56 = 21
        
        int negativeSubarray = 0;
        for(int i = 0; i<arr.length;i++){
            for (int j = i; j < arr.length; j++) {
				int [] tempArr = Arrays.copyOfRange(arr, i, j+1);
				System.out.println(Arrays.toString(tempArr));
				int sum =0;
				for(int tempA : tempArr){
					sum = sum+tempA;
				}
				if(sum <0){
					System.out.println("added " +Arrays.toString(tempArr));
					negativeSubarray++;
				}
			}
        }
        System.out.println(negativeSubarray);
    }
	
}
