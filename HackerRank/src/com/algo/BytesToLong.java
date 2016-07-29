package com.algo;

public class BytesToLong {

	public static void main(String[] args) {
		int[] array = {-15,9,0,9,0};
		int firstHighest = 0;
        int secondHighest = 0;
        if(array[0] > array[1]){
            firstHighest = array[0];
            secondHighest = array[1];
        }else{
            firstHighest = array[1];
            secondHighest = array[0];
        }
        for(int i=2; i<array.length;i++){
            if(array[i] >=0  && array[i] >firstHighest){
                secondHighest= firstHighest;
                 firstHighest = array[i];
            }else if(array[i]>= 0 && array[i] >secondHighest){
                secondHighest=i;
            }else if(array[i]<0 && firstHighest <0 && array[i]< firstHighest){
                secondHighest= firstHighest;
                 firstHighest = array[i];
            }else if(array[i] < 0 && secondHighest<0 && array[i] <secondHighest){
                secondHighest = array[i];
            }
            
        }
	        System.out.println(secondHighest);
}
	
	
	
	
}
