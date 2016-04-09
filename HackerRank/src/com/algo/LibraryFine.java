package com.algo;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int returnDate = input.nextInt();
        int returnMonth = input.nextInt();
        int returnYear = input.nextInt();
        int expectDate = input.nextInt();
        int expectMonth = input.nextInt();
        int expectYear = input.nextInt();
        
        if(returnYear> expectYear){
        	System.out.println(10000);
        	return;
        }else if(expectYear<= returnYear){
        	if(returnMonth > expectMonth){
        		System.out.println(500*(returnMonth-expectMonth));
        		return;
        }else if(returnMonth == expectMonth && returnDate > expectDate){
        	System.out.println(15*(returnDate-expectDate));
        	return;
        }
        }
        	System.out.println(0);
        }
}
