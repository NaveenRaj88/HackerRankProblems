package com.algo;

import java.io.File;
import java.text.ChoiceFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MinPalindrome {

	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
		Calendar c = Calendar.getInstance();
		double[] limits={1,2};

	}
	
	
	 static int shortPalin(String s) {
	        int minChars = 0;
	    StringBuilder sb = new StringBuilder(s);
	        if(s.equals(sb.reverse())){
	            return minChars;
	        }
	         int midPoint= s.length()/2;
	        for(int i=0, j=s.length()-1; i<midPoint;i++){
	            if(s.charAt(i) == s.charAt(j)){
	                j--;
	                continue;
	            }else{
	                minChars++;
	                midPoint++;
	            }
	        }
	        return minChars;
	    }
}
