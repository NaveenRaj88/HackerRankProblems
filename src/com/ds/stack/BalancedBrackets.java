package com.ds.stack;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by anandran on 3/23/17.
 */
public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while(n-- >0){
            char[] inputChars = scan.nextLine().toCharArray();
            int ind = 0;
            char[] openBrackets = new char[inputChars.length];
            for (int i = 0; i <inputChars.length ; i++) {
                if(inputChars[i] == '}'){
                    if(ind <1 || openBrackets[--ind] != '{'){
                        ind = Integer.MAX_VALUE;
                        break;
                    }
                }
                else if(inputChars[i] == ']'){
                    if(ind <1 || openBrackets[--ind] != '['){
                        ind = Integer.MAX_VALUE;
                        break;
                    }
                }else if(inputChars[i] == ')' ){
                    if(ind <1 || openBrackets[--ind] != '('){
                        ind = Integer.MAX_VALUE;
                        break;
                    }
                }else{
                    openBrackets[ind++] = inputChars[i];
                }
            }
            if(ind == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
