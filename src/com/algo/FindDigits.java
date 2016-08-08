package com.algo;

public class FindDigits {
	
	public static void main(String[] args) {
            int n = 111;
            int divident = n;
            int divisor=0;
            int count=0;
            while(divident >0){
                divisor = divident%10;
                if(divisor>0 && n%divisor == 0){
                    count++;
                }
                divident/=10;
            }
            System.out.println(count);
        }
}
