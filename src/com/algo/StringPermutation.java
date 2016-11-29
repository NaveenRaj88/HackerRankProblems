package com.algo;

/**
 * Created by Naveen Kumar .A on 11/28/16.
 */
public class StringPermutation {

    public static void main(String[] args) {
        String str = "abc";
        permutation("", str);

    }

    private static void permutation(String prefix, String word){
        int n = word.length();
        if(n==0){
            System.out.println(prefix);
        }
        for (int i = 0; i <n ; i++) {
            permutation(prefix+word.charAt(i), word.substring(0,i)+word.substring(i+1,n));
        }

    }

    public  static void perm1(String s) { perm1("", s); }
    private static void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
        }

    }

}
