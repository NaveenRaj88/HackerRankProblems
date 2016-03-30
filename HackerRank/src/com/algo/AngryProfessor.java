package com.algo;

public class AngryProfessor {

	public static void main(String[] args) {
		int n =4;
		int k =2;
		int[] a = {-1,-3,4,2};
		int studentOnTime=0;
		for(int i:a){
			if(i<=0){
				studentOnTime++;
		}
		}
		if(studentOnTime >= k){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	
}
}
