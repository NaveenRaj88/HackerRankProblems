package com.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaprekarNumbers {

	public static void main(String[] args) {
		char[][] ch = new char[2][2];
		
        long p = 77778;
        long q = 99999;
        List<Long> kaprekarNumbers = new ArrayList<>();
        while(p<=q){
        	if(p ==1){
        		kaprekarNumbers.add(p);
        		p++;
        		continue;
        	}
            long square = p*p;;
            String squareNumber = String.valueOf(square);
            String [] numberArray = squareNumber.split("");
            int midpoint = numberArray.length/2;
            if(midpoint == 0){
            	p++;
            	continue;
            }
            int leftSum =0;
            int rightSum = 0;
             leftSum = Integer.parseInt(squareNumber.substring(0, midpoint));
             rightSum+=Integer.parseInt(squareNumber.substring(midpoint, squareNumber.length()));
            if(leftSum + rightSum == p){
                kaprekarNumbers.add(p);
            }
            p++;
        }
        if(kaprekarNumbers.size() ==0){
            System.out.println("INVALID RANGE");
        }else{
            for(long i : kaprekarNumbers){
                System.out.print(i+" ");
            }
        }
        
    }
}
