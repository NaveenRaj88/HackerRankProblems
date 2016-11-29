package com.algo;

/**
 * Created by Naveen Kumar .A on 11/28/16.
 */
public class StringRemoveChar {

    public static void main(String[] args) {
        String str = "abcdefedr";
        char c = 'e';
        System.out.println(removeChar(str, c));
        System.out.println(removeCharIter(str, c));
        System.out.println(removeCharIterStringBuilder(str, c));
    }


    private static String removeChar(String str, char c) {
        if (str == null || str.length() == 0 || str.indexOf(c) < 0) {
            return str;
        }
        int index = str.indexOf(c);
        if (index == 0) {
            return removeChar(str.substring(1), c);
        } else {
            return removeChar(str.substring(0, index) + str.substring(index + 1), c);
        }
    }

    private static String removeCharIter(String str, char c) {
        while (str.indexOf(c) >= 0) {
            int index = str.indexOf(c);
            if (index == 0) {
                str = str.substring(1);
            } else {
                str = str.substring(0, index) + str.substring(index + 1);
            }
        }
        return str;
    }

    private static String removeCharIterStringBuilder(String str, char c){
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();
        for(char ch : charArr){
            if(ch != c){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
