package com.algo;

/**
 * Created by anandran on 1/5/17.
 */
public class printpattern {

    public static void main(String[] args) {
        int i =4;
        for (int j = 1,k = 4; j < 4; j++,k--) {
            int num = 1;
            while(num<=j) {
                System.out.print(num++);
            }
            int spaces = 0;
            while(spaces++<=Math.abs(k-j)){
                System.out.print("*");
            }
            System.out.println();
            if(j == i){

            }
        }
    }
}
