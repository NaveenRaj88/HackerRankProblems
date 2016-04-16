package com.algo;

import java.util.Scanner;

public class SherlockandSquares {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        for(int i=0; i<loop;i++){
            long a = in.nextLong();
            long b = in.nextLong();
            int sqCount=0;
            for(long j = a; j<= b; j++){
                double sq = Math.sqrt(j);
                if(sq == Math.floor(sq)){
                    sqCount++;
                }
            }
            System.out.println(sqCount);
        }
    }
}
