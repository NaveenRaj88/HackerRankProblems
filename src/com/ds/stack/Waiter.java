package com.ds.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anandran on 3/24/17.
 */
public class Waiter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int ind = 0;
        List<Integer> initPile = new ArrayList<>();
        while (ind++ < n) {
            initPile.add(scan.nextInt());
        }
        List<Integer> pileA = new ArrayList<>();
        List<Integer> pileB = new ArrayList<>();
        int currPrime = 2;
        int i;
        for (i = 0; i < q; i++) {
            if (initPile.isEmpty()) {
                break;
            }
            ind = initPile.size();
            while (ind-- > 0) {
                if (initPile.get(ind) % currPrime == 0) {
                    pileB.add(initPile.get(ind));
                } else {
                    pileA.add(initPile.get(ind));
                }
            }
            for (int k = pileB.size() - 1; k >= 0; k--) {
                System.out.println(pileB.get(k));
            }
            pileB.clear();
            initPile = pileA;
            pileA = new ArrayList<>();
            currPrime = getNextPrime(currPrime);
        }

        for (int j = initPile.size() - 1; j >= 0; j--) {
            System.out.println(initPile.get(j));
        }


    }

    private static int getNextPrime(int i) {
        while (!isPrime(++i)) ;
        return i;
    }


    private static boolean isPrime(int i) {
        for (int j = 2; j <= (i / 2); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}

