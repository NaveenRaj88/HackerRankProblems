package com.ds.stack;

import java.util.Scanner;

/**
 * Created by anandran on 3/23/17.
 */
public class SimpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ind = 0;
        String[] prevStates = new String[8];
        StringBuffer currString = new StringBuffer();
        while (n-- > 0) {
            int command = scan.nextInt();
            switch (command) {
                case 1:
                    prevStates[ind++] = currString.toString();
                    currString.append(scan.next());
                    break;
                case 2:
                    prevStates[ind++] = currString.toString();
                    int val = scan.nextInt();
                    currString.delete(currString.length() - val, currString.length());
                    break;
                case 3:
                    val = scan.nextInt();
                    System.out.println(currString.charAt(val - 1));
                    break;
                case 4:
                    currString.setLength(0);
                    currString.append(prevStates[--ind]);
            }
        }

    }
}
