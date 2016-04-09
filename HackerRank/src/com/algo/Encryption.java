package com.algo;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int length = input.length();
        int rows = (int)Math.floor(Math.sqrt(length));
        int columns = (int) Math.ceil(Math.sqrt(length));
        while(rows*columns < length){
            rows++;
        }
        char[][] encryptGrid = new char[rows][columns];
        for(int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i*columns+j>=length){
                    break;
                }
                encryptGrid[i][j]=input.charAt(i*columns+j);
            }
        }
        for(int i =0;i<columns;i++){
            StringBuffer buffer = new StringBuffer();
            for(int j=0;j<rows;j++){
               if(encryptGrid[j][i] !=0){
                buffer.append(encryptGrid[j][i]);
               }
            }
            System.out.print(buffer);
            System.out.print(" ");
        }
    }
}
