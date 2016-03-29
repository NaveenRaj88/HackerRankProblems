package com.algo;

public class FractionOfPosNegAndZero {

	
		public static void main(String[] args) {
	        int n = 6;
	        int arr[]= {-4,3,-9,0,4,1};
	        double posCount =0;
	        double negCount =0;
	        double zeroCount=0;
	        for(int i:arr){
	            if(i>0){
	                posCount++;
	            }else if(i<0){
	                negCount++;
	            }else{
	                zeroCount++;
	            }
	        }
	        System.out.println(""+posCount/n);
	        System.out.println(negCount/n);
	        System.out.println(zeroCount/n);
	}
}
