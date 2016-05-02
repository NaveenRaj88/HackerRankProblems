package com.algo;

public class ShortestPalindrome {

	
	public static void main(String[] args) {
		String s = "ababacbd";
		int sl = s.length();
		int mid;
		if(sl%2==0){
			mid = (sl/2)-1;
		}else{
		 mid = sl/2;
		}
		int i = mid-1;
		int j = mid+1;
		int minPalin =0;
		while (true) {
			if(i<0 && j>s.length()-1){
				break;
			}
			if(s.charAt(i) != s.charAt(j)){
				minPalin++;
				if(j<s.length()-1){
					j++;
				}else if(i>1){
					i--;
				}
				continue;
			}
			
			if(i>=1){
				i--;
			}
			if(j<s.length()-1){
				j++;
			}
		}
		System.out.println(minPalin);
	}
}
