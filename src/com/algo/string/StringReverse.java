package com.algo.string;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String s = "lsdhfe";
		char[] strArr = s.toCharArray();
		int len = strArr.length;
		for (int i = 0; i <len/2 ; i++) {
			int temp = strArr[i];
			strArr[i] = strArr[len-i-1];
			strArr[len-i-1] = (char)temp;
		}
		System.out.println(Arrays.toString(strArr));
	}
}
