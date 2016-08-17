package com.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Naveen Kumar .A on 8/11/16.
 */
public class SaveThePrisoner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int s = scan.nextInt();
            int poisonedSweet = (m+s-1)%n;
            if(poisonedSweet == 0 ){
                poisonedSweet = n;
            }
            Queue<Integer> ll = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
            System.out.println(poisonedSweet);
        }
    }
}
