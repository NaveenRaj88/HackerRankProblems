package com.algo;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int[] arr = {-2,-3, -5,-10};
		int highest =Integer.MIN_VALUE;
		int sec_highest = Integer.MIN_VALUE;
		for (int i : arr) {
			if(i>0){
			if(i> highest){
				sec_highest = highest;
				highest = i;
			}else if(i> sec_highest){
				sec_highest = i;
			}
			}else{
				if(highest <0 && i> highest){
					sec_highest = highest;
					highest = i;
				}else if(sec_highest<0 && i> sec_highest){
					sec_highest = i;
				}
			}
		}
		
		System.out.println(sec_highest);
	}
}
