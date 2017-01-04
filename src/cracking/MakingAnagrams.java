package cracking;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anandran on 1/3/17.
 */
public class MakingAnagrams {


    public static int numberNeeded(String first, String second) {

        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();

        int letterCounts[] = new int[26];

        int result=0;
        for (char c: firstChar) {
            letterCounts[c-'a']++;
        }

        for (char c: secondChar) {
            letterCounts[c-'a']--;
        }

        for(int i : letterCounts){
            result+=Math.abs(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        switch (in.nextInt()) {
            case 1:
                System.out.println(1);
            case 2 :

        }
    }
}
