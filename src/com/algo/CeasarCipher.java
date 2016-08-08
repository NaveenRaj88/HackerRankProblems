package com.algo;

import java.util.Scanner;

public class CeasarCipher {
	
	public static void main(String[] args) {
		
        int strLen = 100;
        String str = "gDNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.";
        int encryptKey = 45;
        char[] ch = str.toCharArray();
        StringBuffer encryptStr = new StringBuffer();
        for(char c : ch){
            if(c<65 || (c>90 && c<97)|| c >122){
                encryptStr.append(c);
                continue;
            }
            int delta = 0;
            int pos =0;
            if(c< 97){
            	pos=64;
                delta = c-64;
            }else{
            	pos=96;
                delta = c-96;
            }
             int encryptPos = (delta+encryptKey)%26;
             if(encryptPos ==0){
            	 encryptPos=26;
             }
             char charac =(char) (encryptPos+pos);
              encryptStr.append(String.valueOf(charac));
        }
        System.out.println(encryptStr);
    }
	
}
