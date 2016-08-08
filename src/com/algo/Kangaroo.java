package com.algo;

/**
 * Created by Naveen on 29-07-2016.
 */
public class Kangaroo {

    public static void main(String[] args) {
        int x1 = 28;
        int v1 = 8;
        int x2 = 96;
        int v2 = 2;
        if((x1<x2 && v1<v2) ||(x1>x2 && v1>v2)){
            System.out.println("NO");
            return;
        }else{
            x1=x1+v1;
            x2=x2+v2;
            for(int i=0;  i  <Integer.MAX_VALUE;i++,x1+=v1,x2+=v2){
                if(x1==x2){
                    System.out.println("YES");
                    return;
                }
            }

        }
        System.out.println("NO");

    }
}
