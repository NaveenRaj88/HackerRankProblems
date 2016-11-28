package com.algo;

public class Fibonnaci {

	public static void main(String[] args) {
		int i = 10;

		for (int j = 0; j <i; j++) {
			System.out.println(fibRecur(j) +"    "+ fibIter(j));
		}
//		System.out.println(fibRecur(i));
	}

	private static int fibRecur(int i) {
		if (i < 2) {
			return 1;
		}
			return (fibRecur(i - 1) + fibRecur(i - 2));
	}

    private static int fibIter(int i){
        if(i <2){
            return 1;
        }
        int prev =1;
        int current =1;
        int counter =2;
        while(counter++ <= i ){
            int temp = current;
            current = current+prev;
            prev = temp;
        }
        return current;
    }
}
