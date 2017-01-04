package com.algo;

/**
 * Created by Naveen Kumar .A on 12/9/16.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        Map<Integer, Integer> socks = new HashMap<>();
        for (int i : c) {
            if (socks.containsKey(i)) {
                socks.put(i, socks.get(i) + 1);
            }else {
                socks.put(i, 1);
            }
        }
        int totalPairs = 0;
        for (Integer key : socks.keySet()) {
            int sockCount = socks.get(key);
            if (sockCount > 1) {
                int count = sockCount / 2;
                totalPairs += count;
            }
        }
        System.out.println(totalPairs);
    }
}

