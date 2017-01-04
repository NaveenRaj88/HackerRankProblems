package com.algo.array;

import java.util.Scanner;

public class Java1DArrayP2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		while (tests-- > 0) {
			int arrLen = in.nextInt();
			int jumpLen = in.nextInt();
			int[] arr = new int[arrLen];
			for (int i = 0; i < arrLen; i++) {
				arr[i] = in.nextInt();
			}
			for (int i = 0; i < arrLen; i++) {
				if (i == arrLen - 2 || (i + jumpLen) > (arrLen - 1)) {
					System.out.println("YES");
					break;
				}
				if (arr[i + 1] != 0) {
					if (arr[i + jumpLen] != 0) {
						if(i>1 && arr[(i-1)+jumpLen] ==0){
							i=(i-1)+jumpLen;
						}else{
							System.out.println("NO");
							break;
						}
					} else {
						i = i + jumpLen;
					}
				}
			}

		}
	}
}
