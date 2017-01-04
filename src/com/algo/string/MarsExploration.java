package com.algo.string;

import java.util.Scanner;

/**
 * Created by Naveen Kumar .A on 12/9/16.
 */
public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String token = "SOS";
        int mutatedChars =0;
        for(int i=0;i < S.length(); i+=3){
            if(!token.contains(S.substring(i, i+3))){
                mutatedChars++;
            }
        }
        System.out.println(mutatedChars);
    }
}
