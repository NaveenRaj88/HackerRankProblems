package com.algo;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while(testCases-->0){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int chocolates = n/c;
            int totalChocs=chocolates;
            while(chocolates >= m){
            int disChocs = chocolates/m;
            int dRemain = chocolates%m;
            totalChocs = totalChocs+disChocs;
            chocolates = disChocs+dRemain;
            }
            System.out.println(totalChocs);
        }
	}
}
