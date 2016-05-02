package com.algo;

public class StringReverseInPlace {

	public static void main(String[] args) {
		String s ="abcde";
		char[] c = s.toCharArray();
		int len = c.length/2;
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			char temp = c[c.length-i-1];
			c[c.length-i-1]=c[i];
			c[i] = temp;
		} 
		for (char d : c) {
			System.out.print(d);
		}
	}
}
