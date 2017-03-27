package com.algo.implementation;

import java.util.Scanner;

/**
 * Created by anandran on 3/27/17.
 */
public class BeautifulDaysattheMovies{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int count =0;
        for(int n = i; n<=j; n++){
            if((Math.abs(n-getReversedInt(n)))%k ==0){
                count++;
            }
        }
        System.out.print(count);
    }

    private static int getReversedInt(int i){
        StringBuffer sb = new StringBuffer();
        while(i > 0){
            sb.append(i%10);
            i/=10;
        }
        return Integer.parseInt(sb.toString());
    }
}
