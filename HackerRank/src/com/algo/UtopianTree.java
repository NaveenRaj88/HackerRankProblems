package com.algo;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
            int n = 1012;
            int plantHeight=1;
            int counter=1;
            while(counter<=n){
                if(counter%2 !=0){
                    plantHeight*=2;
                }else{
                    plantHeight++;
                }
                counter++;
            }
            System.out.println(plantHeight);
        }
}
