package com.algo;

import java.util.Scanner;

/**
 * Created by Naveen Kumar .A on 8/8/16.
 */
public class CookieParty {

    public static void main(String[] args) {
        System.out.println(4/5);
        double num = 4/5;
        System.out.println(Math.ceil(num));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(m ==0){
            System.out.println(n);
        }
        int divider = m/n;
        int remainder = m%n;
        if(n<m){
            System.out.println(n-m);
        }
         else if(remainder ==0)
        {
            System.out.println(0);
        }else{
            System.out.println(m-remainder);
        }
    }
}
