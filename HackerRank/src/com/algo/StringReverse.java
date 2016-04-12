package com.algo;

public class StringReverse {

	public static void main(String[] args) {
		String s = "lsdhf";
		String strArr[] = s.split("");
		StringBuilder build = new StringBuilder();
		for (int i = strArr.length-1; i>=0; i--) {
			build.append(strArr[i]);
		}
		System.out.println(build.toString());
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		
		for (double x = 0; x != 10; x += 0.1){
			System.out.println(x);
		}
	}
}
