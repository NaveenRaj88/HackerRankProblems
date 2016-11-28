package com.algo;

/**
 * Created by Naveen Kumar .A on 11/28/16.
 */
public class NumberReverse {

    public static void main(String[] args) {
        int number = 3456;
        int reverse =0;
        int remainder =0;
        while(number >0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
    }

}
