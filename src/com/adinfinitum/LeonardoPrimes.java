package com.adinfinitum;

import java.util.Scanner;

/**
 * Created by Naveen Kumar .A on 9/2/16.
 */
public class LeonardoPrimes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int fac = scan.nextInt();
            int maxPrimeCount = 0;
            int maxPrime = 0;
            int[] primeCount = new int[fac + 1];
            for (int i = 2; i <= fac; i++) {
                int curPrimeCount = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0 && !isComposite(j)) {
                        curPrimeCount++;
                    }
                }
                    primeCount[curPrimeCount]+=curPrimeCount;
                 if(primeCount[curPrimeCount] > maxPrimeCount){
                    maxPrimeCount = primeCount[curPrimeCount];
                     maxPrime = curPrimeCount;
                 }
            }
            System.out.println(maxPrime);
        }
    }


    private static boolean isComposite(int n) {
        if (n > 1 && n <= 3) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 4; i < sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
