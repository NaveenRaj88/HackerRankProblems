package com.algo;

public class SherlockandTheBeast {

	public static void main(String[] args) {
		int[] a = {7};
		for (int i : a) {
			int threes = 0;
			if (i < 3 || i==4) {
				System.out.println(-1);
			}else if (i == 3 || i % 3 == 0) {
				System.out.println(generateNumbers(i,5));
			}else
			if (i == 5) {
				System.out.println(generateNumbers(i,3));
			}else if (i > 5) {

				while (i % 3 != 0) {
					threes = threes + 5;
					i -= 5;
				}
				if((i<3 && i>0) || i<0){
					System.out.println(-1);
				}else{
					System.out.println(generateNumbers(i, 5)+ generateNumbers(threes,3));
				}
				
			}
			
		}
	}

	static String generateNumbers(int length, int number) {
		StringBuilder numberStr =new StringBuilder();
		while (length-- >= 1) {
			numberStr.append(number);
		}
		return numberStr.toString();
		
	}
}
