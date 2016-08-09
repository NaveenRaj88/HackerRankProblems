package com.algo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Naveen on 29-07-2016.
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = 3;
        int k = 2;
        int q=3;
        int[] cirArr = {1,2,3};
        for(int i=0;i<q;i++){
            int index = (in.nextInt()+k+1)%(n);
            index++;
            if(index==cirArr.length){
                System.out.println(cirArr[0]);
            }else{
                System.out.println(cirArr[index]);
            }
        }
       in.close();
    }
    }
